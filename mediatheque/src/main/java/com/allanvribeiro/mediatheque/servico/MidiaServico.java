package com.allanvribeiro.mediatheque.servico;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import com.allanvribeiro.mediatheque.modelo.Midia;
import com.allanvribeiro.mediatheque.persistencia.MidiaDao;

public class MidiaServico implements Serializable {

	private static final long serialVersionUID = 6108835948805764718L;

	@Inject
	private MidiaDao midiaDao;
	
	public void salvarMidia(Midia midia) {
		midiaDao.salvar(midia);
	}
	
	public List<Midia> buscarMidias(String termoDeBusca) {
		return midiaDao.listar(termoDeBusca);
	}
	
}
