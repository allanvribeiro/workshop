package com.allanvribeiro.mediatheque.modelo;

public enum TipoMidia {

	FILME("Filme"),
	LIVRO("Livro"),
	JOGO("Jogo"),
	MUSICA("Música");
		
	String descricao;
	
	TipoMidia(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}	
}
