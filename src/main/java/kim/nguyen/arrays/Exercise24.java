/**
 * Show that the class from Exercise 19 can be searched.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise24 {
    public static void main(String[] args) {
        int size = 20;
        Number[] array = new Number[size];
        NumberComparator comparator = new NumberComparator();
        
        /* Assigns values for array */
        for (int index = 0; index < size; ++index) {
            int value = (int) (Math.random() * 100);
            array[index] = new Number(value);
        }
        
        /* Prints values of the array1 on the screen */
        System.out.println("Array before sorting: " + Arrays.toString(array));
        
        Arrays.sort(array, comparator);
        System.out.println("Array after sorting: " + Arrays.toString(array));
        
        /* Get the index of the value passed in binarySearch */
        int index = Arrays.binarySearch(array, array[5], comparator);
        System.out.println("Value at index " + index + " is: " + array[index]);
    }
}

class NumberComparator implements Comparator<Number> {
    public int compare(Number firstNumber, Number secondNumber) {
        return (firstNumber.getNumber() > secondNumber.getNumber() ? 1
                : (firstNumber.getNumber() == secondNumber.getNumber() ? 0 : -1));
    }
}
