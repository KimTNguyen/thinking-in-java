/**
 * Write a method that uses an Iterator to step through a Collection and 
 * print the toString( ) of each object in the container. Fill all the 
 * different types of Collections with objects and apply your method to 
 * each container.
 *
 * @version %I%, %G%
 *
 * @author Kim Nguyen
 */

package kim.nguyen.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Exercise11 {
	public static <T> void printElements(Iterator<T> iteratorList) {
	    
		while(iteratorList.hasNext()) {
			T element = iteratorList.next();
			System.out.print(element.getClass().getSimpleName() + element + " ");
		}
		
		System.out.println();
	}

	public static void main(String[] args) {

		/* Creates a list of Cat */
		List<Cat> cats = new ArrayList<Cat>();
        Cat[] catArray = {new Cat(), new Cat(), new Cat()};
        Collections.addAll(cats, catArray);
        Iterator<Cat> itCat = cats.iterator();

        /* Creates a list of Gerbil */
        Set<Gerbil> gerbilList = new HashSet<Gerbil>();
		Collections.addAll(gerbilList, new Gerbil(1), new Gerbil(2), new Gerbil(3));
		Iterator<Gerbil> itGerbil = gerbilList.iterator();

        printElements(itCat);
        printElements(itGerbil);
	}
}