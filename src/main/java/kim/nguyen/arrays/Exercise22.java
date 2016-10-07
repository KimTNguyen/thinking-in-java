/**
 * Exercise22.java Show that the results of performing a binarySearch( ) on an unsorted array are unpredictable.  
 *
 * @version %I%, %G%
 *
 * @author Kim Nguyen
 */

package kim.nguyen.arrays;

import java.util.Arrays;

public class Exercise22 {

    public static void main(String[] args) {
        int[] arr = { 7, 4, 10, 3, 4, 20, 8 };

        System.out.println(Arrays.toString(arr));
        System.out.println("Index of element 20 is: " + Arrays.binarySearch(arr, 20));
        System.out.println("Index of element arr[3] is: " + Arrays.binarySearch(arr, arr[3]));
    }
}