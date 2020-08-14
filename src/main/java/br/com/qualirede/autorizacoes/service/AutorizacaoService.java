package br.com.qualirede.autorizacoes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.qualirede.autorizacoes.repository.AutorizacaoRepository;

@Service
public class AutorizacaoService {
	
	@Autowired
	private AutorizacaoRepository autorizacaoRepository;

	public void cadastrarProcedimento(String procedimento, Integer idade, String sexo, String permissao) {
		// TODO Auto-generated method stub
		
	}

}
