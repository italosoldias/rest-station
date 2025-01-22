package com.dias.station.dto;

import com.dias.station.entities.Game;

public class JogosMinDTO {

	
	private Long id;
	private String titulo;
	private Integer ano;
	private String urlImagem;
	private String descricaoCurta;
	public JogosMinDTO(Game entidade) {
		
		id = entidade.getId();
		titulo = entidade.getTitulo();
		ano = entidade.getAno();
		urlImagem = entidade.getUrlImagem();
		descricaoCurta = entidade.getDescricaoCurta();
	}
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public Integer getAno() {
		return ano;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public String getDescricaoCurta() {
		return descricaoCurta;
	}
	
	
	
}
