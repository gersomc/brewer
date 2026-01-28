package com.algaworks.brewer.model;

public enum Origem {
	
	Nacional("Nacional"),
	Internacional("Internacional");
	
	
	private String descricao;
	
	Origem(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
