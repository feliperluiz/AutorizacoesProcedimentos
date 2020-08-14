package br.com.qualirede.autorizacoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qualirede.autorizacoes.model.Autorizacao;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long> {

}
