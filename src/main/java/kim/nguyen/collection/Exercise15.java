/**
 * Stacks are often used to evaluate expressions in programming languages. 
 * Using Stack to evaluate the following expression, where’+’ means "push 
 * the following letter onto the stack," and’-’ means "pop the top of the 
 * stack and print it": "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—" 
 *
 * @version %I%, %G%
 *
 * @author Kim Nguyen
 */

package kim.nguyen.collection;

import java.util.LinkedList;

public class Exercise15 {
    public static void main(String[] args) {
        final String str = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—";
        Stack<Character> stack = new Stack<Character>();

        int index = 0;
        while (index < str.length()) {
            switch (str.charAt(index)) {
            case '+':
                index++;
                while (index < str.length() && str.charAt(index) != '+' && str.charAt(index) != '-') {
                    char c = str.charAt(index);
                    stack.push(c);
                    index++;
                }
                break;
            case '-':
                if (!stack.empty()) {
                    System.out.print(stack.pop());
                    index++;
                }
                break;
            }
        }

        System.out.println(stack.toString());
    }
}

class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v) {
        storage.addFirst(v);
    }

    /* they return the head (first element) of the list without removing it */
    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
}