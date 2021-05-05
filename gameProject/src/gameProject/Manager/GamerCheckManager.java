package gameProject.Manager;

import gameProject.Entity.Gamer;
import gameProject.GameService.GamerCheckService;


public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean GamerCheck(Gamer gamer) {
		if (gamer.getIdentityNumber().length() == 11 ) {
			System.out.println("Kimlik do�rulama ba�ar�l� ");
			return true;
		}
		else
			System.out.println("Robot musunuz ?)");
		return false;
		
	}

}