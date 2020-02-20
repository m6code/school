package lab06.cosc301.lab06;


import java.util.Scanner;
import lab01.cosc301.PrintingVisitor;
import lab01.cosc301.Visitor;
import lab06.cosc301.BinaryTree;

public class TestBinaryTree {
	static	Scanner stdin = new Scanner(System.in);

	public static void main (String[] args){
		// Create an instance of BinaryTree called tree
		// to be completed by students
		
		
		
		
		int choice;
		printTree(tree);
		
		do {
			showMenu();
			choice = getChoice();
			
			switch (choice) {
			case 1: checkElement(tree);
				    break;
			case 2: printCounts(tree);
				    break;
			case 3: printSum(tree);
				    break;
			case 4: 
                   System.out.println();
				   // Display tree in bracketed form by invoking the treePrinter method 
				   // to be completed by students
				   
				   
				   
				   
				   break;
			}
			printTree(tree);
		} while (choice != 5);
	}
		
	public static void printTree(BinaryTree tree) {
		Visitor v = new PrintingVisitor();
		
		System.out.print("\nPreorder traversal:      ");
		// Perform a preorder traversal on tree using the visitor v
		// to be completed by students
		
		
		System.out.print("\nInorder traversal:       ");
		// Perform an inorder traversal on tree using the visitor v
		// to be completed by students
		
		
		System.out.print("\nPostorder traversal:     ");
		// Perform a postorder traversal on tree using the visitor v
		// to be completed by students
		
	    
		System.out.print("\nBreadth first traversal: ");
		// Perform a breadthFirst traversal on tree using the visitor v
		// to be completed by students
		
		
		
		System.out.println();
	}
		
	public static void checkElement(BinaryTree tree){
		System.out.print("\nEnter the key to be searched for: ");
		int key = stdin.nextInt();
		// Search for key in tree and display a message whether the key is found or not
		// to be completed by students
		
		
		
		
	}
	
	public static void printCounts(BinaryTree tree) {
		// Display the total number of nodes in tree
		
		// Display the number of internal nodes in tree
		
		// Display the number of leaf nodes in tree
		// to be completed by students
		
		
	}
	
	public static void printSum(BinaryTree tree) {
        // Display the sum of the keys of tree using the AdditionVisitor of lab01 and a preorder depthFirstTraversal
        // to be completed by students
		
		
		
		
	}
	
 	public static void treePrinter(BinaryTree t){
 		// to be completed by students as a recursive method.
 		
 		
 		
 		
 		
 		
 		
 		
 		
 	}
 	
 	static int getChoice(){
      int choice; 
      do {
         System.out.print("\rYour choice? : ");
         choice = stdin.nextInt();
		} while (choice < 1 || choice > 5);    
      return choice;
	}
 	
 	static void showMenu() {
 		System.out.println("\n********************************");
 		System.out.println("*   Testing Binary Tree  *");
 		System.out.println("********************************");
 		System.out.println("1.  Check for an Element");
 		System.out.println("2.  Print Counts");
		System.out.println("3.  Print Sum");
		System.out.println("4.  Print with Brackets");
		System.out.println("5.  Quit");
 	}
}
