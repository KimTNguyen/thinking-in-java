/**
 * Create a class, then make an initialized array of objects of your class.
 * Fill a List from your array. Create a subset of your List by using subList( ), 
 * then remove this subset from your List.
 *
 * @version %I%, %G%
 *
 * @author Kim Nguyen
 */

package kim.nguyen.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise7 {

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<Cat>();
        Cat[] catArray = {new Cat(), new Cat(), new Cat()};
        Collections.addAll(cats, catArray);
        List<Cat> sub = cats.subList(0, 2);
        
        System.out.println(sub.toString());
    }
}

class Cat {
    private int id = 0;
    private static int count = 0;
    
    public Cat() {
        id = count;
        count++;
    }
    
    public String toString() {
        return Integer.toString(id);
    }
}
