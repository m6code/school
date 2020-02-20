package lab04.cosc301.lab04;

import java.util.Scanner;
import lab01.cosc301.Iterator;
import lab04.cosc301.QueueAsArray;

public class TestQueueAsArray {

    public static void main(String[] args) {
        QueueAsArray queueAsArray = new QueueAsArray(6);
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the name of the " + (i + 1) + "st on queue");
            String name = input.next();
            queueAsArray.enqueue(name);
        }

        // Printing Using the Iterator method of the QueueAsArray class
//        Iterator e = queueAsArray.iterator();
//        System.out.println("People in queue: ");
//        while (e.hasNext()) {
//            System.out.println( e.next());
//        }

        //Printing Using the toString() method of the container
        System.out.println("People in queue: \n" + queueAsArray);
        
        while (queueAsArray.getCount() != 0) {
            System.out.println("Time to attend to: " + queueAsArray.dequeue());
            System.out.println("People in queue: \n" + queueAsArray);
        }
      
    }

}
