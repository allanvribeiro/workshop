package com.allanvribeiro.mediatheque.controladores;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import com.allanvribeiro.mediatheque.modelo.Midia;
import com.allanvribeiro.mediatheque.modelo.TipoMidia;
import com.allanvribeiro.mediatheque.servico.MidiaServico;

@Named
@RequestScoped
public class MidiaController {

	private String termoDeBusca;
	private List<Midia> resultadoBusca;
	private Midia novaMidia;
	private TipoMidia[] tiposMidia;
	private UploadedFile imagemMidiaEnviada;
	
	@Inject
	private MidiaServico midiaServico;
	
	@PostConstruct
	public void init() {
		novaMidia = new Midia();
		tiposMidia = TipoMidia.values();
	}
	
	public void salvarMidia() {
		
		//TODO Definir imagem padrão
		if(imagemMidiaEnviada != null) {
			novaMidia.setImagem(imagemMidiaEnviada.getContents());
		}
		
		midiaServico.salvarMidia(novaMidia);
		novaMidia = new Midia();
	}

	public void buscarMidias() {
		resultadoBusca = midiaServico.buscarMidias(termoDeBusca);
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

	public Midia getNovaMidia() {
		return novaMidia;
	}

	public void setNovaMidia(Midia novaMidia) {
		this.novaMidia = novaMidia;
	}

	public TipoMidia[] getTiposMidia() {
		return tiposMidia;
	}

	public void setTiposMidia(TipoMidia[] tiposMidia) {
		this.tiposMidia = tiposMidia;
	}

	public UploadedFile getImagemMidiaEnviada() {
		return imagemMidiaEnviada;
	}

	public void setImagemMidiaEnviada(UploadedFile imagemMidiaEnviada) {
		this.imagemMidiaEnviada = imagemMidiaEnviada;
	}
	
}
