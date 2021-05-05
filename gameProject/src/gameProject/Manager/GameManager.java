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
		System.out.println(game.getGameName()+" Güncellendi");
		
	}

	@Override
	public void buy(Gamer gamer, Game game) {
		System.out.println(gamer.getNickName()+" Kullanýcý isimli kiþi "+game.getGameName()+" Satýn aldý");
	}

	@Override
	public void buy2(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getNickName()+" Kullanýcý isimli kiþi "+game.getGameName()+" Oyununu "+campaign.getCampaignDiscount()+" Oranýnda indirim ile satýn aldý");
		
	}

}

