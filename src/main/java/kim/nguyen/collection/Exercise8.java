/**
 * Modify Exercise l so it uses an Iterator to move through the List 
 * while calling hop( ).
 *
 * @version %I%, %G%
 *
 * @author Kim Nguyen
 */

package kim.nguyen.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercise8 {

	public static void main(String[] args) {
		List<Gerbil> gerbilList = new ArrayList<Gerbil>();
		Collections.addAll(gerbilList, new Gerbil(1), new Gerbil(2), new Gerbil(3));
		Iterator<Gerbil> it = gerbilList.iterator();

		while (it.hasNext()) {
			Gerbil gerbil = it.next();
			gerbil.hop();
		}
	}
}