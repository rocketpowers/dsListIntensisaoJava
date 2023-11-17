package dsListPackages.dto;

import dsListPackages.entities.Game;
import lombok.Getter;

@Getter
public class GameMinDto {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDto() {

	}


	public GameMinDto(Game entity) {

		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

}
