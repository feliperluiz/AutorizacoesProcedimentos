package br.com.qualirede.autorizacoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.qualirede.autorizacoes.enums.PERMISSAO;
import br.com.qualirede.autorizacoes.enums.SEXO;
import br.com.qualirede.autorizacoes.model.Autorizacao;
import br.com.qualirede.autorizacoes.repository.AutorizacaoRepository;

@Service
public class AutorizacaoService {
	
	@Autowired
	private AutorizacaoRepository autorizacaoRepository;

	public void cadastrarProcedimento(Integer procedimento, Integer idade, SEXO sexoEnum, PERMISSAO permissaoEnum) {
		Autorizacao autorizacao = new Autorizacao();
		autorizacao.setIdade(idade);
		autorizacao.setPermissao(permissaoEnum);
		autorizacao.setSexo(sexoEnum);
		autorizacao.setProcedimento(procedimento);
		autorizacaoRepository.save(autorizacao);
		
	}

	public PERMISSAO obterAutorizacao(Integer procedimento, Integer idade, SEXO sexoEnum) {
		List<Autorizacao> autorizacoes = autorizacaoRepository.findAllByProcedimentoAndIdadeAndSexo(procedimento, idade, sexoEnum);
		return !autorizacoes.isEmpty() ? PERMISSAO.SIM : PERMISSAO.NAO;
		
	}

}
