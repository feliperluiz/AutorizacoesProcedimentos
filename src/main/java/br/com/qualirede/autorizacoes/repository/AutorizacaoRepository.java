package br.com.qualirede.autorizacoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qualirede.autorizacoes.enums.SEXO;
import br.com.qualirede.autorizacoes.model.Autorizacao;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long> {

	public List<Autorizacao> findAllByProcedimentoAndIdadeAndSexoEnum(Integer procedimento, Integer idade, SEXO sexoEnum);

}
