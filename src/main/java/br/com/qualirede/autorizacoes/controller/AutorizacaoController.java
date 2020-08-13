package br.com.qualirede.autorizacoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qualirede.autorizacoes.service.AutorizacaoService;

@RestController
@RequestMapping("/autorizador")
public class AutorizacaoController {
	
	@Autowired
	private AutorizacaoService autorizacaoService;
	
	@GetMapping("/cadastro/procedimento/1234/idade/10/sexo/M/autoriza/SIM")

}
