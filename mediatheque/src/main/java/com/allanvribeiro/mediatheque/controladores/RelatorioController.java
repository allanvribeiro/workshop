package com.allanvribeiro.mediatheque.controladores;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.allanvribeiro.mediatheque.persistencia.UsuarioDao;

@Named
@RequestScoped
public class RelatorioController {

	@Inject
	UsuarioDao usuarioDao;
}
