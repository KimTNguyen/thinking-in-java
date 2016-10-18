/**
 * Utils.java This is a collection of generic methods using in the project.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.projects;

import java.util.Arrays;
import java.util.Comparator;

public class Utils {

    /**
     * Adds new element to the end of the array
     * 
     * @param array
     *            the array to which the new element will be added
     * @param element
     *            the element will be added to the array
     * @return the array with new element
     */
    public static <T> T[] addElement(T[] array, T element, Comparator<? super T> comp) {
        T[] tmp = array;
        Arrays.sort(tmp, comp);
        int result = Arrays.binarySearch(tmp, element, comp);
        if (result < 0) {
            tmp = Utils.resizeArray(tmp);
            tmp[tmp.length - 1] = element;
        }
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
