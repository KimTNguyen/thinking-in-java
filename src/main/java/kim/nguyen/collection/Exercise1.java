/**
 * Create a new class called Gerbil with an int gerbilNumber that's initialized in the constructor.
 * Give it a method called hop() that displays which gerbil number that is, and that it's hopping.
 * Create an ArrayList and add Gerbil objects to the List. Now use the get() method to move through
 * the List and call hop() for each Gerbil.
 *
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.collection;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {
		List<Gerbil> gerbilList = new ArrayList<Gerbil>();
		gerbilList.add(new Gerbil(1));
		gerbilList.add(new Gerbil(2));
		gerbilList.add(new Gerbil(3));

		for (int index = 0; index < gerbilList.size(); ++index) {
			gerbilList.get(index).hop();
		}
	}
}

class Gerbil {
	private int gerbilNumber;

	public Gerbil(int number) {
		gerbilNumber = number;
	}

	public void hop() {
		System.out.println("gerbil number " + gerbilNumber + " is hopping!");
	}
}