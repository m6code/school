package lab02.cosc301.lab02;

import java.util.Scanner;

public class TestMySearchableContainer{
	
	public static void main(String[] args){

		Scanner stdin = new Scanner(System.in);

		MySearchableContainer c = new MySearchableContainer();
		
		int choice;
		while((choice =menu(stdin)) != 5){
			switch(choice){
			  case 1: insert(c, stdin); break;
			  case 2: delete(c, stdin); break;
			  case 3: search(c, stdin);break;
			  case 4: display(c);
			}
			
		} 
	}
	
	public static int menu(Scanner stdin){
	  int choice = 0;
	  do{
		System.out.println("1. Add element(s)");
		System.out.println("2. Delete an element");
		System.out.println("3. Search for an element");
		System.out.println("4. Display all elements");
		System.out.println("5. Exit");
		
		System.out.println("Please enter your choice");
		choice = stdin.nextInt();
		
		if(choice < 1 || choice > 5)
		  System.out.println("Error - Wrong choice");
	  }while(choice < 1 || choice > 5);
	
	  return choice;
	}
	
	public static void insert(MySearchableContainer c, Scanner stdin){
		int capacity = c.getSize() - c.getCount();
		int number;
		do{
		  System.out.println("Enter number of elements to insert <=" + capacity);
		  number = stdin.nextInt();
		  
		  if(number > capacity) 
		     System.out.println("Error - wrong input");
		}while(number > capacity);
		
		// Insert the elements. To be completed by students
		
		
		
		
		
	}
	
	public static void delete(MySearchableContainer c, Scanner stdin){
		System.out.print("Enter element to remove: ");
	   
	    // to be completed by students
		
		
		
		
	}
	
	public static void search(MySearchableContainer c, Scanner stdin){
		System.out.print("Enter an element to search for: ");
		
		// to be completed by students
	    
	    
	    
	    
	    
	}
	
	public static void display(MySearchableContainer c){
		//to be completed by students
	
	 	
	}
	
}
				