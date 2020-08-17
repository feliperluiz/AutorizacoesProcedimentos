package br.com.qualirede.autorizacoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qualirede.autorizacoes.enums.PERMISSAO;
import br.com.qualirede.autorizacoes.enums.SEXO;
import br.com.qualirede.autorizacoes.service.AutorizacaoService;

@RestController
@RequestMapping("/autorizador")
public class AutorizacaoController {
	
	@Autowired
	private AutorizacaoService autorizacaoService;
	
	
	@GetMapping(path = "/cadastro/procedimento/{proc}/idade/{idade}/sexo/{sexo}/autoriza/{permissao}") 
	public ResponseEntity<String> cadastrarProcedimento(@PathVariable("proc") Integer procedimento, 
            @PathVariable("idade") Integer idade,
            @PathVariable("sexo") String sexo,
            @PathVariable("permissao") String permissao) {
	
		SEXO sexoEnum = SEXO.valueOf(sexo);
		PERMISSAO permissaoEnum = PERMISSAO.valueOf(permissao);
		autorizacaoService.cadastrarProcedimento(procedimento, idade, sexoEnum, permissaoEnum);
		return ResponseEntity.ok("OK");
		
	}
	
	@GetMapping(path = "/procedimento/{proc}/idade/{idade}/sexo/{sexo}") 
	public ResponseEntity<String> obterPermissao(@PathVariable("proc") Integer procedimento, 
            @PathVariable("idade") Integer idade,
            @PathVariable("sexo") String sexo) {
	
		SEXO sexoEnum = SEXO.valueOf(sexo);

		PERMISSAO permissao = autorizacaoService.obterAutorizacao(procedimento, idade, sexoEnum);
		
		return ResponseEntity.ok(permissao.getValor());
		
	}

}
