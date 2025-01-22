package com.dias.station.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dias.station.dto.JogosMinDTO;
import com.dias.station.entities.Game;
import com.dias.station.repos.GameRepos;

@Service
public class JogoService {

	@Autowired
	private GameRepos repositorioJogos; 
	
	public List<JogosMinDTO> BuscarTodosJogos (){
		List<Game> result = repositorioJogos.findAll();
		List<JogosMinDTO> dto = result.stream().map(x -> new JogosMinDTO(x)).toList();
		return dto;
	};
}
