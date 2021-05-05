package gameProject;

import gameProject.Entity.Campaign;
import gameProject.Entity.Game;
import gameProject.Entity.Gamer;
import gameProject.Manager.CampaignManager;
import gameProject.Manager.GameManager;
import gameProject.Manager.GamerCheckManager;
import gameProject.Manager.GamerManager;

public class Main {

	public static void main(String[] args) {

		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		Gamer gamer1 = new Gamer(123, "26.11.2002", "Mislina", "Aydýn", "misgibiyazilim","12345678901");
		Gamer gamer2 = new Gamer(234, "25.04.2002", "Þeyda", "Özay", "dilcikýz","23456789012");

		gamerManager.add(gamer2);
		gamerManager.login(gamer1);

		CampaignManager campaignManager = new CampaignManager();

		Campaign campaign1 = new Campaign(1, "Süper Fýrsat", "20%");

		campaignManager.updated(campaign1);

		GameManager gameManager = new GameManager();
		Game game1 = new Game(1, 200, "oyun1 ");
		Game game2 = new Game(2, 300, "oyun2 ");
		Game game3 = new Game(3, 250, "oyun3 ");
		Game game4 = new Game(4, 350, "oyun4 ");
		Game game5 = new Game(5, 400, "oyun5 ");

		gameManager.add(game1);
		gameManager.deleted(game2);
		gameManager.updated(game3);
		gameManager.buy(gamer1, game1);
		gameManager.buy2(gamer1,game1,campaign1);
		
		

	}

}
