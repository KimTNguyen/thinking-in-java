/**
 * Create and populate a List<Integer>. Create a second List<Integer> 
 * of the same size as the first, and use ListIterators to read elements 
 * from the first List and insert them into the second in reverse order. 
 * (You may want to explore a number of different ways to solve this problem.)
 *
 * @version %I%, %G%
 *
 * @author Kim Nguyen
 */

package kim.nguyen.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Exercise12 {
    public static void main(String[] args) {

        /* Creates and populates a List<Integer> */
        List<Integer> firstList = new ArrayList<Integer>();
        Collections.addAll(firstList, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        /* Creates a second List<Integer> of the same size as the first */
        List<Integer> secondList = new ArrayList<Integer>(firstList.size());

        ListIterator<Integer> listItr1 = firstList.listIterator(firstList.size());
        ListIterator<Integer> listItr2 = secondList.listIterator();

        /*
         * Reads elements from the first List and insert them into the second in
         * reverse order
         */
        while (listItr1.hasPrevious()) {
            listItr2.add(listItr1.previous());
        }

        listItr2 = secondList.listIterator();

        while (listItr2.hasNext()) {
            System.out.print(listItr2.next());
        }
    }
}