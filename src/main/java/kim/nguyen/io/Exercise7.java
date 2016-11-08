/**
 * Open a text file so that you can read the file one line at a time. Read each 
 * line as a String and place that String object into a LinkedList. Print all 
 * of the lines in the LinkedList in reverse order.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */

package kim.nguyen.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        
        try {
            bufferedReader = new BufferedReader(new FileReader("joke.txt"));
            
            LinkedList<String> list = new LinkedList<String>();
            String str;

            /*
             * Reads each line as a String and place that String object into a
             * LinkedList
             */
            while ((str = bufferedReader.readLine()) != null) {
                list.add(str);
            }

            ListIterator<String> itr = list.listIterator(list.size());

            /* Prints all of the lines in the LinkedList in reverse order */
            while (itr.hasPrevious()) {
                System.out.println(itr.previous());
            }

        } finally {
            
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
}
