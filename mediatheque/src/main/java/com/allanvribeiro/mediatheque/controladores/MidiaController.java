package com.allanvribeiro.mediatheque.controladores;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.allanvribeiro.mediatheque.modelo.Midia;

@Named
@RequestScoped
public class MidiaController {

	private String termoDeBusca;
	private List<Midia> resultadoBusca;

	
	public String getTermoDeBusca() {
		return termoDeBusca;
	}

	public void setTermoDeBusca(String termoDeBusca) {
		this.termoDeBusca = termoDeBusca;
	}	
}
