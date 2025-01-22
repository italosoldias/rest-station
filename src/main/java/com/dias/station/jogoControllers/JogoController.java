package com.dias.station.jogoControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dias.station.dto.JogosMinDTO;
import com.dias.station.entities.Game;
import com.dias.station.services.JogoService;

@RestController
@RequestMapping(value= "/games")
public class JogoController {
	@Autowired
	private JogoService servicoJogo;
	@GetMapping
	public List<JogosMinDTO> controladorBuscarTodosJogos(){
		List<JogosMinDTO> result = servicoJogo.BuscarTodosJogos();
		return result;
		
	};
	
	
}
