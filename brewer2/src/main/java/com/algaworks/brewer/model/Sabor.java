package com.algaworks.brewer.model;

public enum Sabor {
	
	ADOCICADA("Adocicado"),
	AMARGO("Amargo"),
	FORTE("Forte"),
	FRUTADO("Frutado"),
	SUAVE("Suave");
	
	private String descricao;
	
	Sabor(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
