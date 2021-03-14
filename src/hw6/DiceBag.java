package hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// This class holds the dice(or tokens) to be drawn.

public class DiceBag {
	private List<Token> bag = new ArrayList<Token>();
	
	public void addToken(Token t) {
		bag.add(t);
	}

	public Token drawToken() {
		int upperRange = bag.size();
		
		// Check if upperRange is 0, because the rand() will put out an error
		if (upperRange == 0) {
			return null;
		}
		
		Token t = null;
		
		int die = ThreadLocalRandom.current().nextInt(0, upperRange); // Changed to 0 cause it's out of bounds
		if (upperRange > 0 ) {  // Change to 0 to make it in bound
			t = bag.remove(die);
		}
		return t;
	} // end drawToken()
	
	public String toString() {
		String ret = " Dice left: " + bag.size() + "\n";
		
		for (Token t:bag) {
			ret += t.toString() + "\n";
		}
		
		return ret;
	} // end toString()
	
} // end class
