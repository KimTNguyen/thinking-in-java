/**
 * ArrayComputation.java does some computation, such as swap elements and find 
 * maximal elements, on generic arrays
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.arrays;

import java.util.Arrays;

public class ArrayComputation {
    public static void main(String[] args) {
        /* the size of the array */
        final int SIZE = 10;
        
        Integer[] e = new Integer[SIZE];

        /*
         * the index which indicates where the search for the biggest element
         * will begin
         */
        int start = 5;

        /*
         * the index which indicates where the search for the biggest element
         * will end
         */
        int end = SIZE - 1;

        /* Assigns random values for the array */
        for (int index = 0; index < SIZE; ++index) {
            e[index] = ((int) (Math.random() * 100));
        }

        System.out.println("Before exchanging elements: " + Arrays.toString(e));

        System.out.println("After exchanging elements: " + Arrays.toString(swapElements(e, 3, 5)));

        System.out.println(
                "The maximal element in range [" + start + " - " + end + "] is: " + findMaximalElement(e, start, end));
    }

    /**
     * Exchanges the positions of two different elements in an array
     * 
     * @param array
     *            the array which contains two different elements whose
     *            positions will be exchanged
     * @param index1
     *            first element's index
     * @param index2
     *            second element's index
     * @return the array after its elements are exchanged
     */
    public static <T> T[] swapElements(T[] array, int index1, int index2) {
        T[] arr = Arrays.copyOf(array, array.length);

        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }

    /**
     * Finds the maximal element in the range [begin, end) of a list
     * 
     * @param array
     *            the array on which the search will be performed
     * @param start
     *            indication of where the search will start
     * @param end
     *            indication of where the search will end
     * @return the maximal elements in the range specified
     */
    public static <T> T findMaximalElement(T[] array, int start, int end) {
        /* Copies values in the range specified to the new array */
        T[] newArray = Arrays.copyOfRange(array, start, end);

        /* Sorts the new array in ascending order */
        Arrays.sort(newArray);

        /* Returns the last element of the new array */
        return newArray[newArray.length - 1];
    }
}
