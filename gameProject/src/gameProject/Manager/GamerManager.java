package gameProject.Manager;

import gameProject.Entity.Gamer;
import gameProject.GameService.GamerService;

public class GamerManager implements GamerService {

	private GamerCheckManager gamerCheckManager;

	public GamerManager(GamerCheckManager gamerCheckManager) {
		this.gamerCheckManager = gamerCheckManager;
	}

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getNickName() + " Kullanýcý adlý kiþi eklendi");

	}

	@Override
	public void deleted(Gamer gamer) {
		System.out.println(gamer.getNickName() + " Kullanýcý adlý kiþi silindi");

	}

	@Override
	public void updated(Gamer gamer) {
		System.out.println(gamer.getNickName() + " Kullanýcý adlý kiþi güncellendi");

	}

	@Override
	public void login(Gamer gamer) {
		if (gamerCheckManager.GamerCheck(gamer) == true) {
			System.out.println(" giriþ yapýldý :  " + gamer.getNickName());
		}else
			System.out.println(" hatalý giriþ ");
		
	}

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getNickName() + " Kullancý adlý kiþi kayýt edildi");

	}

}
