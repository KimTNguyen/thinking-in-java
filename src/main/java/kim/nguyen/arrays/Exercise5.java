/**
 * Exercise5.java Demonstrate that multidimensional arrays of non-primitive types are 
 * automatically initialized to null.
 * 
 * @since %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.arrays;

import java.util.Arrays;

/**
 * The Exercise5 class demonstrates that null values will be assigned
 * automatically to non-primitive types of the multidimensional array.
 * 
 */
public class Exercise5 {
    
	public static void main(String[] args) {

		/* The size of the multidimensional array */
		int size = 5;

		/* The multidimensional array of Shape */
		Shape[][] arrayOfShapes = new Shape[size][size];

		/* Prints values of the multidimensional array */
		System.out.println(Arrays.deepToString(arrayOfShapes));
	}
}

/**
 * The Shape class is created to demonstrate that without being initialized, it
 * will point to null in the multidimensional array.
 *
 */
class Shape {
	String color;
	String description;

	Shape(String color, String description) {
		this.color = color;
		this.description = description;
	}
}
