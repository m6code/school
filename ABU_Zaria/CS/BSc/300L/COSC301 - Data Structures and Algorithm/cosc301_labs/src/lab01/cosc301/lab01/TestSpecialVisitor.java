package lab01.cosc301.lab01;

import java.util.Scanner;
import lab01.cosc301.SpecialVisitor;

public class TestSpecialVisitor {

    public static void main(String[] args) {
        int noOfIntEntered;
        MyContainer container = new MyContainer();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 integers (sperated by space): ");

        for (int i = 0; i < 12; i++) {
            container.insert(Integer.parseInt(in.next()));
        }

        System.out.println("Enter The target: ");
        int target = in.nextInt();

        System.out.println("Enter the number of times: ");
        int n = in.nextInt();
        
        SpecialVisitor specialVistor = new SpecialVisitor(target, n);
        container.accept(specialVistor);
        
        if(specialVistor.hasAtleastNobjects()){
            System.out.println(target + " was found " + n + " times");
        } else {
            System.out.println(target + " was not found " +n+ " times");
        }
        
        System.out.println("Content of array: " + container.toString());
    }

}
