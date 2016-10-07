/**
 * Create an array of Integer, fill it with random int values (using autoboxing), 
 * and sort it into reverse order using a Comparator.
 *
 * @version %I%, %G%
 *
 * @author Kim Nguyen
 */

package kim.nguyen.arrays;

import java.util.Arrays;
import java.util.Collections;

public class Exercise23 {
    public static void main(String[] args) {
        Integer[] arr = { 7, 4, 10, 3, 4, 20, 8 };

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
