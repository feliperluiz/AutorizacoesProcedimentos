package br.com.qualirede.autorizacoes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.qualirede.autorizacoes.controller.AutorizacaoController;
import br.com.qualirede.autorizacoes.enums.PERMISSAO;
import br.com.qualirede.autorizacoes.enums.SEXO;
import br.com.qualirede.autorizacoes.service.AutorizacaoService;


@RunWith(SpringRunner.class)
public class AutorizacoesProcedimentosApplicationTests {

	@InjectMocks
    private AutorizacaoController autorizacaoController;
	
	@Mock
	private AutorizacaoService autorizacaoService;
	
	@Before
    public void setup() {
		MockitoAnnotations.initMocks(this); 
	}
	 
	@Test
	public void saveAutorizacaoTest() {
		Integer randomProcedimento = Integer.valueOf(Long.valueOf(Math.round(Math.random() * 10000)).intValue());
		Integer randomIdade = Integer.valueOf(Long.valueOf(Math.round(Math.random() * 120)).intValue());
		autorizacaoController.cadastrarProcedimento(new Integer(randomProcedimento.intValue()), new Integer(randomIdade.intValue()), SEXO.M.name(), PERMISSAO.NAO.name());
	}
	
	
	@Test
	public void getAutorizacaoTest() {
		autorizacaoController.cadastrarProcedimento(1234, 28, SEXO.M.name(), PERMISSAO.SIM.name());
		ResponseEntity<String> permissaoObtida = autorizacaoController.obterPermissao(new Integer(1234), new Integer(28), SEXO.M.name());
		assertEquals(permissaoObtida.getBody(), PERMISSAO.SIM.getValor());

	}

}
