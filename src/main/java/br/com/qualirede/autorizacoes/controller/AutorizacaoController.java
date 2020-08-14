package br.com.qualirede.autorizacoes.controller;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qualirede.autorizacoes.service.AutorizacaoService;

@RestController
@RequestMapping("/autorizador")
public class AutorizacaoController {
	
	@Autowired
	private AutorizacaoService autorizacaoService;
	
	@GetMapping(path = "/cadastro/procedimento/{proc}/idade/{idade}/sexo/{sexo}/autoriza/{permissao}") 
	public ResponseEntity<String> cadastrarProcedimento(@PathVariable("proc") String procedimento, 
            @PathVariable("idade") Integer idade,
            @PathVariable("sexo") String sexo,
            @PathVariable("permissao") String permissao) {
	
		autorizacaoService.cadastrarProcedimento(procedimento, idade, sexo, permissao))
		return ResponseEntity.ok("OK");
		
	}
	
	@GetMapping(path = "/cadastro/procedimento/{proc}/idade/{idade}/sexo/{sexo}/autoriza/{permissao}") 
	public Response obterPermissao(@PathVariable("proc") String procedimento, 
            @PathVariable("idade") Integer idade,
            @PathVariable("sexo") String sexo,
            @PathVariable("permissao") String permissao) {
	
		return null;
		
	}

}
