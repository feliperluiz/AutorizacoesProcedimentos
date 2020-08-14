package br.com.qualirede.autorizacoes.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	@Column(name = "procedimento", nullable = false, insertable = true, updatable = true)
	private SEXO sexo;
	
	@Column(name = "permitido", nullable = false, insertable = true, updatable = true)
	private boolean isPermitido;

	
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
	
	public boolean isPermitido() {
		return isPermitido;
	}
	public void setPermitido(boolean isPermitido) {
		this.isPermitido = isPermitido;
	}
	public SEXO getSexo() {
		return sexo;
	}
	public void setSexo(SEXO sexo) {
		this.sexo = sexo;
	}
		
	

}
