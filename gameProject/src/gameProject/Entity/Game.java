package gameProject.Entity;

public class Game {
	public Game() {

	}

	private int id;
	private int price;
	private String gameName;
	
	public Game(int id,int price,String gameName) {
		this.id=id;
		this.price=price;
		this.gameName=gameName;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

}
