/**
* Exercise9.java Create the classes necessary for the Peel<Banana> example and show 
* that the compiler doesn’t accept it. Fix the problem using an ArrayList.
* 
* @version %I%, %G%
*
* @author Kim Nguyen
*/

package kim.nguyen.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Exercise9 class demonstrates that it is not possible to create an array
 * of generic types, but instead a reference to generic type of array will be
 * created by casting.
 */
public class Exercise9 {

	public static void main(String[] args) {
		int size = 5; // the size of the ArrayList

		ArrayList<Peel<Banana>> array = new ArrayList<Peel<Banana>>();

		/*
		 * Assigns and prints values for the ArrayList
		 */
		for (int i = 0; i < size; ++i) {
			array.add(new Peel<Banana>(new Banana()));
			System.out.println(array.get(i).toString());
			System.out.println(array.get(i).getElement().toString());
		}
	}
}

class Peel<T> {
	T element;

	Peel(T element) {
		this.element = element;
	}

	T getElement() {
		return element;
	}
}

class Banana {
	/* Keeps tracks of the number of Banana object is created */
	private static int count = 0;

	/* An unique id for each Banana object created */
	private final int id;

	Banana() {
		id = count++;
		System.out.println("Banana: " + id);
	}
}
