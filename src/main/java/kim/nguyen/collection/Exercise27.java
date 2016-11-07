/**
 * Write a class called Command that contains a String and has a method operation( ) 
 * that displays the String. Write a second class with a method that fills a Queue 
 * with Command objects and returns it. Pass the filled Queue to a method in a 
 * third class that consumes the objects in the Queue and calls their operation( ) 
 * methods.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */
package kim.nguyen.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise27 {
    public static void main(String[] args) {
        CommandQueue commandQueue = new CommandQueue();
        for (Command command : commandQueue.fill()) {
            command.operation();
        }
    }
}

class Command {
    String command;

    public Command(String command) {
        this.command = command;
    }

    public void operation() {
        System.out.println(command);
    }
}

class CommandQueue {
    public Queue<Command> fill() {
        Queue<Command> queue = new LinkedList<Command>();
        queue.offer(new Command("walk"));
        queue.offer(new Command("stop"));
        Collections.addAll(queue, new Command("run"), new Command("crawl"));
        return queue;
    }
}