package lab03.cosc301.lab03;
import java.util.Scanner;
import lab03.cosc301.MyLinkedList;

public class TestShops {
	static	Scanner stdin = new Scanner(System.in);

	public static void main (String[] args){
		MyLinkedList shoplist = new MyLinkedList();
    	int choice;
    	String shopName, itemName;
    	
    	initializeList(shoplist);
    	
    	do {
    	   showMenu();
    	   choice = getChoice();
    		
		   switch (choice) {
			   case 1 :  System.out.println("Enter the shop name");
			             shopName = stdin.nextLine();
			             System.out.println("Enter the item name");
			             itemName = stdin.nextLine();
			             buyItem(itemName, shopName, shoplist);
			  	     break;
			  		     
			   case 2 :  displayShops(shoplist);
			  	     break;		          
			}
  	
		} while (choice != 3);
    }
    
	static int getChoice(){
      int choice; 
      do {
         System.out.print("\nYour choice? : ");
         choice = stdin.nextInt();
		} while (choice < 1 || choice > 3);    
      return choice;
	}
	
	static void showMenu() {
 		System.out.println("\n***************************");
 		System.out.println("1.  Buy an item");
 		System.out.println("2.  Display all shops");
 		System.out.println("3.  Quit");
 	}
 	
 	static void initializeList(MyLinkedList shoplist){
 		// to be completed by students
 	
 	
 	
 	
 		
 		
 		
 	}
 	
 	public static void buyItem(String itemName, String shopName, MyLinkedList shoplist){
 		// to be completed by students
 		
 		
 		
 	}
 	
 	public static void displayShops(MyLinkedList shoplist){
 		// to be completed by students
 		
 		
 		
 		
 	}
}
