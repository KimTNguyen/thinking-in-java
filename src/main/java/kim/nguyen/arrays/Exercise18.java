/**
 * Exercise 18.java Create and fill an array of BerylliumSphere. Copy this array to a new 
 * array and show that it’s a shallow copy. 
 *
 * @version %I%, %G%
 *
 * @author Kim Nguyen 
 */

package kim.nguyen.arrays;

import java.util.Arrays;

public class Exercise18 {

    public static void main(String[] args) {
        /* the size of the array */
        final int SIZE = 3;

        /* the start point from where the array will be copied */
        final int FIRST_INDEX = 0;

        BerylliumSphere[] sphere1 = new BerylliumSphere[SIZE];
        BerylliumSphere[] sphere2 = new BerylliumSphere[SIZE];

        Arrays.fill(sphere1, new BerylliumSphere());

        /* Shallow copy from sphere1 to sphere2 */
        System.arraycopy(sphere1, FIRST_INDEX, sphere2, FIRST_INDEX, sphere2.length);

        /* Demonstrates that System.arraycopy() performs a shallow copy */
        System.out.print("\nsphere1 before: " + sphere1[FIRST_INDEX].getName());
        System.out.print("\nsphere2 before: " + sphere2[FIRST_INDEX].getName());

        sphere2[FIRST_INDEX].setName("oval");

        System.out.print("\nsphere1 after: " + sphere1[FIRST_INDEX].getName());
        System.out.print("\nsphere2 after: " + sphere2[FIRST_INDEX].getName());
    }

}
