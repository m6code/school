package lab09.cosc301.lab09;

import java.util.Scanner;
import lab01.cosc301.PrintingVisitor;
import lab01.cosc301.Visitor;
import lab06.cosc301.BinarySearchTree;

public class BinarySearchTreeTest2
{
	public static void main(String[] args)
	{
		
	  int choice;
	  
	  do 
	  {
		
		Scanner stdin = new Scanner(System.in);
		
		BinarySearchTree mytree = new BinarySearchTree();
		
		int count = 1;
		String inputLine = null;
		System.out.println("To create a Binary Search Tree:");
		System.out.print("Enter integer key#"+ count+ ": ");
			
		while(! (inputLine = stdin.nextLine()).equals(""))
		{
			
			try
			{
			   int key = Integer.parseInt(inputLine);
			   mytree.insert(new Integer(key));
			   count++;
			   System.out.print("Enter integer key#"+ count+ " or press Enter to Quit: ");
			}
			
			catch(IllegalArgumentException e)
			{
				System.out.println("Error - " +  e);
				System.out.print("Enter key#"+ count+ " or press Enter to Quit: ");
				continue;
			}
		}

		System.out.println("\nThe height of the BST is: " + mytree.getHeight());

		Visitor v = new PrintingVisitor();
		
		System.out.print("\nPreorder traversal:      ");
		mytree.preorderTraversal(v);
		
		System.out.print("\nInorder traversal:       ");
		mytree.inorderTraversal(v);
		
		System.out.print("\nPostorder traversal:     ");
		mytree.postorderTraversal(v);
		
		System.out.print("\nBreadth first traversal: ");
		mytree.breadthFirstTraversal(v);
		System.out.println("\nEnter 1 to Quit, Any other number to process another BST");
		choice = stdin.nextInt();
	}while(choice != 1);
  }
}