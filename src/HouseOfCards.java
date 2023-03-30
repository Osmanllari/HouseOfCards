import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HouseOfCards {
	
	private List<House> houses; 
	private Deck deck;
	private Player player;

	public HouseOfCards() {
		houses = new ArrayList<House>();
		deck = new Deck();
		player = new Player();
	}
	

	public Deck getDeck() {
		return deck;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void addHouse(House house) {
		houses.add(house);
	}
	
	public void addPlayer(Player player) {
		this.player = player;
	}
	
	public void addDeck(Deck deck) {
		this.deck = deck;
	}

	//Method for checking the availability of all the houses at the same time
	public boolean checkAllHouses(House h1, House h2, House h3, House h4) {
		
		if(h1.getAvailable() || h2.getAvailable() || h3.getAvailable() || h4.getAvailable()) {
			return true;
		}
		return false;
	}
	
//	@Override
//	public String toString() {
//		return "HouseOfCards [houses=" + houses + ", decks=" + decks + ", players=" + players + "]";
//	}
}
