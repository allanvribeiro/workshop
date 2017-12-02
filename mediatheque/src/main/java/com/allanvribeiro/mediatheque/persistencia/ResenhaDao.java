package com.allanvribeiro.mediatheque.persistencia;

import com.allanvribeiro.mediatheque.modelo.Resenha;

public class ResenhaDao extends DaoGenerico<Resenha> {

	public Resenha buscar(Long id) {
		return buscar(Resenha.class, id);
	}
	
}
