package br.com.qualirede.autorizacoes.enums;

public enum PERMISSAO {
	
	SIM("Sim"), NAO("Não");
	
	private String valor;
	
	private PERMISSAO(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

}
