package com.dias.station.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dias.station.entities.Game;

public interface GameRepos extends JpaRepository<Game, Long>{
	
	

}
