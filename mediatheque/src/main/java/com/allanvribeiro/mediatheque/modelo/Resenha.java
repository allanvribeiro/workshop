package com.allanvribeiro.mediatheque.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="resenha")
public class Resenha extends EntidadePersistencia {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="usuario")
	private Usuario avaliador;
	
	@OneToOne
	@JoinColumn(name="midia")
	private Midia midiaAvaliada;
	
	@Column
	private float nota;
	
	@Column(name="data_resenha")
	@Temporal(TemporalType.DATE)
	private Date dataDaResenha;
	
	
	public Resenha() {
	}
	
	@Override
	Long getId() {
		return this.id;
	}

	public Usuario getAvaliador() {
		return avaliador;
	}

	public void setAvaliador(Usuario avaliador) {
		this.avaliador = avaliador;
	}

	public Midia getMidiaAvaliada() {
		return midiaAvaliada;
	}

	public void setMidiaAvaliada(Midia midiaAvaliada) {
		this.midiaAvaliada = midiaAvaliada;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public Date getDataDaResenha() {
		return dataDaResenha;
	}

	public void setDataDaResenha(Date dataDaResenha) {
		this.dataDaResenha = dataDaResenha;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
