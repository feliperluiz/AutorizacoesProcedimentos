package br.com.qualirede.autorizacoes.enums;

public enum PERMISSAO {
	
	SIM("SIM"), NAO("NÃO");
	
	private String valor;
	
	private PERMISSAO(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

}
