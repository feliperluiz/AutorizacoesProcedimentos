package br.com.qualirede.autorizacoes.enums;

public enum SEXO {
	
	M("Masculino"), F("Feminino");
	
	private String valor;
	
	private SEXO(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

}
