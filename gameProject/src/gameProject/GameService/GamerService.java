package gameProject.GameService;

import gameProject.Entity.Gamer;

public interface GamerService {

	void add(Gamer gamer);

	void deleted(Gamer gamer);

	void updated(Gamer gamer);

	void login(Gamer gamer);

	void register(Gamer gamer);
}
