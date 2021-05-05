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
		System.out.println(gamer.getNickName() + " Kullan�c� adl� ki�i eklendi");

	}

	@Override
	public void deleted(Gamer gamer) {
		System.out.println(gamer.getNickName() + " Kullan�c� adl� ki�i silindi");

	}

	@Override
	public void updated(Gamer gamer) {
		System.out.println(gamer.getNickName() + " Kullan�c� adl� ki�i g�ncellendi");

	}

	@Override
	public void login(Gamer gamer) {
		if (gamerCheckManager.GamerCheck(gamer) == true) {
			System.out.println(" giri� yap�ld� :  " + gamer.getNickName());
		}else
			System.out.println(" hatal� giri� ");
		
	}

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getNickName() + " Kullanc� adl� ki�i kay�t edildi");

	}

}
