/**
 * Fill a PriorityQueue (using offer( )) with Double values created using 
 * java.util.Random, then remove the elements using poll( ) and display them.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.collection;

import java.util.PriorityQueue;
import java.util.Random;

public class Exercise28 {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<Double>();
        Random rand = new Random();
        int size = 20;
        
        /* Fills the queue with Double values */
        for (int index = 0; index < size; ++index) {
            queue.offer(rand.nextDouble());
        }
        
        /* Removes elements from the queue and displays them */
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
