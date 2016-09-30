/**
 * Exercise19.java Create a class with an int field that’s initialized from a 
 * constructor argument. Create two arrays of these objects, using identical 
 * initialization values for each array, and show that Arrays.equals( ) says 
 * that they are unequal. Add an equals( ) method to your class to fix the problem.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.arrays;

import java.util.Arrays;

public class Exercise19 {

	public static void main(String[] args) {
		int size = 3;
		Number[] array1 = new Number[size];
		Number[] array2 = new Number[size];

		/* Assigns values for array1 and array2 */
		for (int index = 0; index < size; ++index) {
			int value = (int) (Math.random() * 100);
			array1[index] = new Number(value);
			array2[index] = new Number(value);
		}

		/* Prints values of the array1 on the screen */
		System.out.print("array1: ");
		for (int index = 0; index < size; ++index) {
			System.out.print(array1[index].getNumber() + " ");
		}

		/* Prints values of the array1 on the screen */
		System.out.print("\narray2: ");
		for (int index = 0; index < size; ++index) {
			System.out.print(array2[index].getNumber() + " ");
		}

		/* without Number.equals() implemented, the result will be false */
		System.out.println("\nAre two arrays equal: " + Arrays.equals(array1, array2));

		String[] tmp = { "1", "2", "3" };
		System.out.println("\nAre two arrays equal: " + Arrays.equals(array1, tmp));
	}

}

class Number {
	private int number;

	Number(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public boolean equals(Object another) throws ClassCastException {
		Number tmp = (Number) another;

		if (Integer.compare(this.number, tmp.number) == 0) {
			return true;
		}
		
		return false;

	}
}
