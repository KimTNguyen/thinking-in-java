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
        final int SIZE = 3;
        Number[][] array1 = new Number[SIZE][];
        Number[][] array2 = new Number[SIZE][];

        /* Assigns values for array1 and array2 */
        for (int row = 0; row < SIZE; ++row) {
            array1[row] = new Number[SIZE];
            array2[row] = new Number[SIZE];

            for (int col = 0; col < SIZE; ++col) {
                int value = (int) (Math.random() * 100);
                array1[row][col] = new Number(value);
                array2[row][col] = new Number(value);
            }

            /*
             * Compares array1 and array2, then prints the result on the screen
             */
            System.out.println("\nAre two arrays equal: " + Arrays.deepEquals(array1, array2));
        }
    }

}
