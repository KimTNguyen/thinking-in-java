/**
 * Create and fill an array of BerylliumSphere. Copy this array to a new 
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
		int arraySize = 3;
		int firstIndex = 0;
		BerylliumSphere[] sphere1 = new BerylliumSphere[arraySize];
		BerylliumSphere[] sphere2 = new BerylliumSphere[arraySize];

		Arrays.fill(sphere1, new BerylliumSphere());
		
		/* Shallow copy from sphere1 to sphere2 */
		System.arraycopy(sphere1, firstIndex, sphere2, firstIndex, sphere2.length);

		/* Demonstrates that System.arraycopy() performs a shallow copy */
		System.out.print("\nsphere1 before: " + sphere1[firstIndex].getName());
		System.out.print("\nsphere2 before: " + sphere2[firstIndex].getName());

		sphere2[firstIndex].setName("oval");
		
		System.out.print("\nsphere1 after: " + sphere1[firstIndex].getName());
		System.out.print("\nsphere2 after: " + sphere2[firstIndex].getName());
	}

}
