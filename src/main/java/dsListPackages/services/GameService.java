package dsListPackages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dsListPackages.dto.GameMinDto;
import dsListPackages.entities.Game;
import dsListPackages.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	//public List<GameMinDto> findAll(){
	public List<GameMinDto> findAll(){
		
		//var result = gameRepository.findAll();
		
		List<Game> result = gameRepository.findAll();
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		
		return dto;
		
		
	}
	
}
