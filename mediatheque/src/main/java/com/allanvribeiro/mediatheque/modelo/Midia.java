package com.allanvribeiro.mediatheque.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Midia extends EntidadePersistencia {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date lancamento;
	
	@Column(columnDefinition= "text")	
	private String descricao;
	
	@Column
	@Lob
	private byte[] imagem;
	
	@Enumerated(EnumType.STRING)
	private TipoMidia tipo;
	
	public Midia() {
		
	}
	
	@Override
	Long getId() {
		return this.id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getLancamento() {
		return lancamento;
	}

	public void setLancamento(Date lancamento) {
		this.lancamento = lancamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoMidia getTipo() {
		return tipo;
	}

	public void setTipo(TipoMidia tipo) {
		this.tipo = tipo;
	}
	
}
