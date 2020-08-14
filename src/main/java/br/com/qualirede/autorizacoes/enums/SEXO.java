package br.com.qualirede.autorizacoes.enums;

public enum SEXO {
	
	M("Masculino"), F("Feminino");
	
	private String chave;
	private String valor;
	
	private SEXO(String valor) {
		this.chave = "authorizationTypes." + name().toLowerCase() + ".nome";
		this.valor = valor;
	}

	public String getChave() {
		return chave;
	}

	public String getValor() {
		return valor;
	}

}
