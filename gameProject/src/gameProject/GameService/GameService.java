package gameProject.GameService;


import gameProject.Entity.Campaign;
import gameProject.Entity.Game;
import gameProject.Entity.Gamer;

public interface GameService {

	void add(Game game);
	void deleted(Game game);
	void updated(Game game);
	
	 void buy(Gamer gamer,Game game);
	 void buy2(Gamer gamer,Game game,Campaign campaign );
	
}
