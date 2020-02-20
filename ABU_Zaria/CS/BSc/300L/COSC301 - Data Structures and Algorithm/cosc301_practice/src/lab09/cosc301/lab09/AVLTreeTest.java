package lab09.cosc301.lab09;

import java.util.Scanner;
import lab01.cosc301.PrintingVisitor;
import lab01.cosc301.Visitor;
import lab09.cosc301.AVLTree;

public class AVLTreeTest{
	public static void main(String[] args){
	  int choice;

	  do{

		Scanner stdin = new Scanner(System.in);

		AVLTree mytree = new AVLTree();

		int count = 1;
		String inputLine = null;
		System.out.println("To create an AVL Tree:");
		System.out.print("Enter key#"+ count+ ": ");

		while(stdin.hasNextInt()){
			try{
			   int key = stdin.nextInt();
			   mytree.insert(new Integer(key));
			   count++;
			   System.out.print("Enter key#"+ count+ " or press any character key to Quit: ");
			}

			catch(IllegalArgumentException e){
				System.out.println("Error - " +  e);
				System.out.print("Enter key#"+ count+ " or press any character key to Quit: ");
				continue;
			}

		}

		stdin.next(); // discard the character used to terminate the above loop.


		System.out.println("\nThe height of the AVL tree is: " + mytree.getHeight());

		Visitor v = new PrintingVisitor();

		System.out.print("\nPreorder traversal:      ");
		mytree.preorderTraversal(v);

		System.out.print("\nInorder traversal:       ");
		mytree.inorderTraversal(v);

		System.out.print("\nPostorder traversal:     ");
		mytree.postorderTraversal(v);

		System.out.print("\nBreadth first traversal: ");
		mytree.breadthFirstTraversal(v);

		System.out.println("\nEnter 1 to Quit, Any other number to process another AVL tree");
		choice = stdin.nextInt();

	}while(choice != 1);
  }
}