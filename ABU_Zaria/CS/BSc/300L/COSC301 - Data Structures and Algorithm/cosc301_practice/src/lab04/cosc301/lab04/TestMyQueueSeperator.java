8 9package lab04.cosc301.lab04;

import java.util.Scanner;
import lab01.cosc301.Iterator;
import lab04.cosc301.QueueAsLinkedList;

public class TestMyQueueSeperator {

    public static void main(String[] args) {
        QueueAsLinkedList allQueue = new QueueAsLinkedList();

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 10 numbers Sperated by space: ");
        for (int i = 0; i < 10; i++) {
            int n = input.nextInt();
            allQueue.enqueue(n);
        }

        QueueAsLinkedList evenQueue = new QueueAsLinkedList();
        QueueAsLinkedList oddQueue = new QueueAsLinkedList();

        Iterator it = allQueue.iterator();

        while (it.hasNext()) {
            //int x = ((Integer)it.next()).intValue();
            //int x = ((Integer)it.next());
            int x = (int) (it.next()); // get the value of the container
            if (x % 2 == 0) {
                evenQueue.enqueue(x);
            } else {
                oddQueue.enqueue(x);
            }
        }

        System.out.println("Content of allQueue= " + allQueue);
        System.out.println("Content of evenQueue= " + evenQueue);
        System.out.println("Content of oddQueue= " + oddQueue);
        
        Math.cos(30);

    }
}
