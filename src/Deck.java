import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
	
	//A deck is a list of Cards
	private ArrayList<Card> deck;
	
	public Deck() {
		List<String> suits = Card.getValidSuits();
		List<String> types = Card.getValidTypes();
		
		deck = new ArrayList<>();
		
		for (String suit:suits) 
		{
			for (String type:types)
				deck.add(new Card(type,suit));
		}
	}
	

	public ArrayList<Card> getDeck() {
		return deck;
	}
	
	//Method that returns the size of the deck
	public int deckSize() {
		return deck.size();
	}
	
	//Method for shuffling a deck of cards
	public void shuffleDeck() {
		Collections.shuffle(deck);
	}
		
	//Method that deals the top card of the deck
	public Card dealCard()  {
		if(deck.size() > 0)
			return deck.remove(0);
		else
			return null;
	}
	
	@Override
	public String toString() {
		return "Deck [deck=" + deck + "]";
	}
}
