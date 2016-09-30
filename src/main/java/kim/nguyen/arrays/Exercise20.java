/**
 * Exercise20.java Demonstrate deepEquals( ) for multidimensional arrays.
 * 
 *  @version %I%, %G%
 *  
 *  @author Kim Nguyen
 */

package kim.nguyen.arrays;

import java.util.Arrays;

public class Exercise20 {
	
	public static void main(String[] args) {
		int size = 3;
		Number[][] array1 = new Number[size][];
		Number[][] array2 = new Number[size][];
		
		/* Assigns values for array1 and array2 */
		for (int row = 0; row < size; ++row) {
			array1[row] = new Number[size];
			array2[row] = new Number[size];
			
			for (int col = 0; col < size; ++col) {
				int value = (int) (Math.random() * 100);
				array1[row][col] = new Number(value);
				array2[row][col] = new Number(value);
			}
			
			/* Compares array1 and array2, then prints the result on the screen */
			System.out.println("\nAre two arrays equal: " + Arrays.deepEquals(array1, array2));
		}
	}

}
