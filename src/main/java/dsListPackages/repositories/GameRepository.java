package dsListPackages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dsListPackages.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	

}
