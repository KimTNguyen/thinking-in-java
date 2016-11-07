/**
 * Take the Gerbil class in Exercise 1 and put it into a Map instead, 
 * associating each Gerbil’s name (e.g. "Fuzzy" or "Spot") as a String 
 * (the key) for each Gerbil (the value) you put in the table. Get an 
 * Iterator for the keySet( ) and use it to move through the Map, looking 
 * up the Gerbil for each key and printing out the key and telling the 
 * Gerbil to hop( ). 
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise17 {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<String, Gerbil>();
        gerbilMap.put("Fuzzy", new Gerbil(0));
        gerbilMap.put("Spot", new Gerbil(1));

        Iterator<String> itr = gerbilMap.keySet().iterator();

        while (itr.hasNext()) {
            String key = itr.next();
            System.out.print(key + ": ");
            gerbilMap.get(key).hop();
        }

    }
}
