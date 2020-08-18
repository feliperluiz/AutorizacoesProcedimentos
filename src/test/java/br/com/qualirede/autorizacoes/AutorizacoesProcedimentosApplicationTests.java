package br.com.qualirede.autorizacoes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.qualirede.autorizacoes.controller.AutorizacaoController;
import br.com.qualirede.autorizacoes.enums.PERMISSAO;
import br.com.qualirede.autorizacoes.enums.SEXO;
import br.com.qualirede.autorizacoes.model.Autorizacao;
import br.com.qualirede.autorizacoes.repository.AutorizacaoRepository;
import br.com.qualirede.autorizacoes.service.AutorizacaoService;


@RunWith(SpringRunner.class)
public class AutorizacoesProcedimentosApplicationTests {

	@InjectMocks
    private AutorizacaoController autorizacaoController;
	
	@Spy
	@InjectMocks
	private AutorizacaoService autorizacaoService;
	
	@Mock
	private AutorizacaoRepository autorizacaoRepository;
	
	@Before
    public void setup() {
		MockitoAnnotations.initMocks(this); 
	}
	 
	@Test
	public void saveAutorizacaoTest() {
		Integer randomProcedimento = Integer.valueOf(Long.valueOf(Math.round(Math.random() * 10000)).intValue());
		Integer randomIdade = Integer.valueOf(Long.valueOf(Math.round(Math.random() * 120)).intValue());
		autorizacaoController.cadastrarProcedimento(randomProcedimento, randomIdade, SEXO.M.name(), PERMISSAO.NAO.name());
	}
	
	
	@Test
	public void getAutorizacaoTest() {
	
		List<Autorizacao> autorizacoes = new ArrayList<>();
		Autorizacao autorizacao = new Autorizacao();
		autorizacao.setId(0);
		autorizacao.setIdade(28);
		autorizacao.setProcedimento(1234);
		autorizacao.setSexo(SEXO.M);
		autorizacao.setPermissao(PERMISSAO.SIM);
		autorizacoes.add(autorizacao);
		
		
		autorizacaoController.cadastrarProcedimento(1234, 28, SEXO.M.name(), PERMISSAO.SIM.name());
		Mockito.when(autorizacaoRepository.findAllByProcedimentoAndIdadeAndSexo(1234, 28, SEXO.M)).thenReturn(autorizacoes);
		ResponseEntity<String> permissaoObtida = autorizacaoController.obterPermissao(1234, 28, SEXO.M.name());
		assertEquals(permissaoObtida.getBody(), PERMISSAO.SIM.getValor());

	}

}
