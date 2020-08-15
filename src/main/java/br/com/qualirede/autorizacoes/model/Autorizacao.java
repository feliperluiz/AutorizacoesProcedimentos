package br.com.qualirede.autorizacoes.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.qualirede.autorizacoes.enums.PERMISSAO;
import br.com.qualirede.autorizacoes.enums.SEXO;

@Entity
public class Autorizacao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5419769421154026701L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "procedimento", nullable = false, insertable = true, updatable = true)
	private Integer procedimento;
	
	@Column(name = "idade", nullable = false, insertable = true, updatable = true)
	private Integer idade;
	
	@Column(name = "sexo", nullable = false, insertable = true, updatable = true)
	private SEXO sexo;
	
	@Column(name = "permissao", nullable = false, insertable = true, updatable = true)
	private PERMISSAO permissao;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProcedimento() {
		return procedimento;
	}
	public void setProcedimento(Integer procedimento) {
		this.procedimento = procedimento;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public SEXO getSexo() {
		return sexo;
	}
	public void setSexo(SEXO sexo) {
		this.sexo = sexo;
	}
	public PERMISSAO getPermissao() {
		return permissao;
	}
	public void setPermissao(PERMISSAO permissao) {
		this.permissao = permissao;
	}
		
	

}
