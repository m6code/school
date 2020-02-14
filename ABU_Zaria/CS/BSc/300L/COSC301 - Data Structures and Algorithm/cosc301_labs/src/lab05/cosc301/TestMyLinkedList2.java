package cosc301.lab05;
import java.util.Scanner;

import cosc301.*;

public class TestMyLinkedList2 
{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		MyLinkedList2 list = new MyLinkedList2();
		
		int i = 1;
		String inputLine;
		
		System.out.print("Enter integer value#"+ i+ " (or press q to quit): ");
		while(stdin.hasNextInt()){
		    list.append(new Integer(stdin.nextInt()));
		    System.out.print("Enter integer value#"+ ++i + " (or press q to quit): ");
		}
		
		stdin.next(); // discard the character used to terminate the above loop
		
		System.out.println("The list is: " + list);
		System.out.println("The list's length is: " + list.length());
		
		
		if(! list.isEmpty()){
			 System.out.print("Enter the integer value to be searched for: ");
		     MyLinkedList2.Element element = list.find(new Integer(stdin.nextInt()));
			 if(element == null)
		   		System.out.println("NOT FOUND");
			  else{
		   		System.out.println("FOUND");
                System.out.print("Enter the integer value to be inserted before the found element: ");
                element.insertBefore(new Integer(stdin.nextInt()));
                System.out.println("The list is: " + list);
            }
	    }
	}
}