package hw6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AddOrderDieTest {

	// Add an OrderDie to the DiceBag. Verify that the OrderDie object is in the DiceBag!
	@Test
	void AddOrderDieTest() {
		DiceBag db = new DiceBag();
		OrderDie od = new OrderDie("Test Description", "Test Color");
		
		db.addToken(od);
		
		Token actual = db.drawToken();
		Token expected = od;
		
		assertEquals(expected, actual);
	}
	
	// Test the toString() method of the DiceBag class. Verify that the returned string is correct!
	@Test
	void testToString() {
		DiceBag db = new DiceBag();
		OrderDie od = new OrderDie("Test Description", "Test Color");
		
		db.addToken(od);
		
		String actual = db.toString();
		String expected = " Dice left: 1\nTest Description\n";
		
		assertEquals(expected, actual);
	}
	
	// Add 3 blue OrderDie object and add 2 red OrderDie objects. Verify that those 5 OrderDie objects are in the DiceBag!
	@Test
	void FiveOrderDieTest() {
		DiceBag db = new DiceBag();
		OrderDie od1 = new OrderDie("First Die", "blue");
		OrderDie od2 = new OrderDie("Second Die", "blue");
		OrderDie od3 = new OrderDie("Third Die", "blue");
		OrderDie od4 = new OrderDie("Fourth Die", "red");
		OrderDie od5 = new OrderDie("Fifth Die", "red");
		
		db.addToken(od1);
		db.addToken(od2);
		db.addToken(od3);
		db.addToken(od4);
		db.addToken(od5);
		
		String actual = db.toString();
		String expected = " Dice left: 5\nFirst Die\nSecond Die\nThird Die\nFourth Die\nFifth Die\n";
		
		assertEquals(expected, actual);
	}
	
} // end class
