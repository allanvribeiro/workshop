package com.allanvribeiro.mediatheque.controladores;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.allanvribeiro.mediatheque.modelo.Midia;
import com.allanvribeiro.mediatheque.persistencia.MidiaDao;

@Named
@RequestScoped
public class MidiaController {

	private String termoDeBusca;
	private List<Midia> resultadoBusca;
	
	private MidiaDao midiaDao = new MidiaDao();

	public void buscarMidias() {
		resultadoBusca = midiaDao.listar(termoDeBusca);
	}
	
	
	public String getTermoDeBusca() {
		return termoDeBusca;
	}

	public void setTermoDeBusca(String termoDeBusca) {
		this.termoDeBusca = termoDeBusca;
	}


	public List<Midia> getResultadoBusca() {
		return resultadoBusca;
	}


	public void setResultadoBusca(List<Midia> resultadoBusca) {
		this.resultadoBusca = resultadoBusca;
	}	
	
	
}
