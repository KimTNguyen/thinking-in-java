/**
 * Create an empty LinkedList<Integer>. Using a Listlterator, add Integers to the 
 * List by always inserting them in the middle of the List.
 *
 * @version %I%, %G%
 *
 * @author KIm Nguyen
 */

package kim.nguyen.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise13 {
	
	public static void main(String[] args) {
		final int startingIndex = 2;
		LinkedList<Integer> list = new LinkedList<Integer>();
		Collections.addAll(list, 1, 2, 5, 6, 7);
		ListIterator itr = list.listIterator(startingIndex);
		Integer[] intArray = {3, 4};

		for (int e : intArray) {
			itr.add(e);
		}
		
		System.out.println(list);
	}
}