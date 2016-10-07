/**
 * Exercise6.java Write a method that takes two int arguments, indicating the 
 * two sizes of a 2-D array. The method should create and fill a 2-D array of 
 * BerylliumSphere according to the size arguments.
 *
 * @version %I%, %G%
 *
 * @author Kim Nguyen
 */
package kim.nguyen.arrays;

import java.util.*;

/**
 * The Exercise6 class demonstrates that each vector of the multidimensional
 * array can be initialized with different sizes.
 *
 */
public class Exercise6 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(initTwoDArray(3, 5)));
    }
    
	/**
	 * Initializes the two dimensional array with different size for each
	 * dimension
	 *
	 * @param rowSize
	 *            the size of the first dimension
	 * @param columnSize
	 *            the size of the second dimension
	 * @return the two dimensional array of BerylliumSphere
	 */
	private static BerylliumSphere[][] initTwoDArray(int rowSize, int columnSize) {
		BerylliumSphere[][] twoDArray = new BerylliumSphere[rowSize][columnSize];

		/* Fill the array of BerylliumSphere */
		for (int row = 0; row < rowSize; ++row) {
			for (int column = 0; column < columnSize; ++column) {
				twoDArray[row][column] = new BerylliumSphere();
			}
		}

		return twoDArray;
	}
}

/**
 * The BerylliumSphere class is a non-primitive class is implemented for the
 * exercise's demonstration purposes. Reference: Thinking in Java p.535
 */
class BerylliumSphere {
	private static long counter;
	private final long id = counter++;
	private String name = "sphere";

	public String toString() {
		return "Sphere " + id;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
}