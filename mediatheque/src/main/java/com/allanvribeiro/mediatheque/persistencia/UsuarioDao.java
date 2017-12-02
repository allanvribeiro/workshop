package com.allanvribeiro.mediatheque.persistencia;

import com.allanvribeiro.mediatheque.modelo.Usuario;

public class UsuarioDao extends DaoGenerico<Usuario> {

	public Usuario buscar(Long id) {
		return buscar(Usuario.class, id);
	}
}
