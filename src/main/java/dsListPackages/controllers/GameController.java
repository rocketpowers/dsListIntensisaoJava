package dsListPackages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dsListPackages.dto.GameMinDto;
import dsListPackages.entities.Game;
import dsListPackages.services.GameService;

@RestController
public class GameController {

	@Autowired
	private GameService gameService;

	
	
	@GetMapping("/games/list")
	public List<GameMinDto> findAll() {
		List<GameMinDto> result = gameService.findAll();
		return result;

	}

}
