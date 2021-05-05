package gameProject.Manager;

import gameProject.Entity.Campaign;
import gameProject.Entity.Game;
import gameProject.Entity.Gamer;
import gameProject.GameService.GameService;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" Eklendi");
	}

	@Override
	public void deleted(Game game) {
		System.out.println(game.getGameName()+" Silindi");
		
	}

	@Override
	public void updated(Game game) {
		System.out.println(game.getGameName()+" G�ncellendi");
		
	}

	@Override
	public void buy(Gamer gamer, Game game) {
		System.out.println(gamer.getNickName()+" Kullan�c� isimli ki�i "+game.getGameName()+" Sat�n ald�");
	}

	@Override
	public void buy2(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getNickName()+" Kullan�c� isimli ki�i "+game.getGameName()+" Oyununu "+campaign.getCampaignDiscount()+" Oran�nda indirim ile sat�n ald�");
		
	}

}

