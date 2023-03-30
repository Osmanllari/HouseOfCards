
public class House {

	private boolean available;
	private int currentValue;
	public final static int MAX_VALUE = 31;

	public House() {
		available = true;
		currentValue = 0;
	}

	
	public boolean getAvailable() {
		return available;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	
	//Method for checking if a House is available
	public boolean isAvailable() {
		if (currentValue < MAX_VALUE) {
			return true;
		} 
		else {
			available = false;
			return false;
		}
	}
	
	//Method for placing a Card's value in a House 
	public void placeCard(Card card) {
		int value = card.getCardValue();
		if(isAvailable()) //maybe we need an exception here 
		currentValue += value; 
	}

	//Method for calculating the House depending on its value
	public void calculateHouse(Player player) {
		if (currentValue == MAX_VALUE) {
			player.addPoints(100);
			currentValue = 0;
		}
		else if (currentValue > MAX_VALUE) {
			available = false;
		}
	}

	@Override
	public String toString() {
		return "House [available=" + available + ", currentValue=" + currentValue + "]";
	}

}
