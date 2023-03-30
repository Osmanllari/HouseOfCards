import java.util.Arrays;
import java.util.List;


import javax.swing.ImageIcon;

public class Card {

	public String suit;
	public String type;
	private ImageIcon cardImage;
	
	public Card(String type, String suit) {	
		try {
			setSuit(suit);
		} catch (InvalidSuitException e) {
			e.printStackTrace();
		}
		try {
			setType(type);
		} catch (InvalidTypeException e) {
			e.printStackTrace();
		}
		String fileName = type + "_of_" + suit + ".png";
		cardImage = new ImageIcon("src./images/" + fileName);
	}
	
	public String getSuit() {
		return suit;
	}
	
	public String getType() {
		return type;
	}
	
	public ImageIcon getCardImage() {
		return cardImage;
	}
	
	public void setSuit(String suit) throws InvalidSuitException{
		List<String> validSuits = getValidSuits();
		
		if(validSuits.contains(suit)) {
			this.suit = suit;
		}
		else {
			throw new InvalidSuitException("Valid card suits are: " + getValidSuits());
		}
		
	}
	
	public void setType(String type) throws InvalidTypeException{
		List<String> validTypes = getValidTypes();
		
		if(validTypes.contains(type)) {
			this.type = type;
		}
		else {
			throw new InvalidTypeException("Valid card types are: " + getValidTypes());
		}
	}
	
	//Method that returns a list containing the valid card suits 
	public static List<String> getValidSuits() {
		return Arrays.asList("hearts","diamonds","clubs","spades");
	}
	
	//Method that returns a list containing the valid card types (name)
	public static List<String> getValidTypes() {
		return Arrays.asList("ace","2","3","4","5","6","7","8","9","10","jack","queen","king");
	}
	
	//Method that returns the value of a card based on the type of card
	public int getCardValue() {
		String type = getType();
		switch(type) {
		case "ace":
			return 11;
		case "2":
			return 2;
		case "3":
			return 3;
		case "4":
			return 4;
		case "5":
			return 5;
		case "6":
			return 6;
		case "7":
			return 7;
		case "8":
			return 8;
		case "9":
			return 9;
		default:
			return 10;
			//The default value is 10, this is the value for, 10, jack, queen, king
		}
	}
	
	@Override
	public String toString() {
		return (type + " of " + suit);
	}
	
}
