/**
 * Utils.java This is a collection of generic methods using in the project.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects;

import java.util.Arrays;

public class Utils {

    /**
     * Adds new element to the array, and increases the number of element count
     * in the array.
     * 
     * @param array
     *            the array to which the new element will be added
     * @param element
     *            the element will be added to the array
     * @param count
     *            the current number of elements in the array
     * @return the new number of elements in the array
     */
    public static <T> T[] addElement(T[] array, T element, int count) {
        T[] tmp = array;
        tmp[count] = element;
        return tmp;
    }

    /**
     * Increases the size of the array by one
     * 
     * @param array
     *            the original array
     * @return the array with the new size
     */
    public static <T> T[] resizeArray(T[] array) {
        int amount = 1;
        T[] tmp = Arrays.copyOf(array, array.length + amount);
        return tmp;
    }
}
