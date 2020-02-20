package lab08.cosc301.lab08;

import lab02.cosc301.lab02.MySearchableContainer;
import java.util.Scanner;
import java.io.*;
import lab06.cosc301.BinaryTree;
import lab08.cosc301.HuffmanChar;
import lab08.cosc301.HuffmanCode;

public class TestHuffmanCode{
   public static void main(String[] args)throws IOException  {
      Scanner stdin = new Scanner(System.in);
      int option;
      HuffmanCode hcode = null;
      MySearchableContainer container = null;
      BinaryTree binarytree = null;
      HuffmanChar huffmanChar;

      do{
         option = menu(stdin);
         switch(option)  {
            case 1: System.out.print("Enter the number of the distinct characters in the table: ");
            		int size = stdin.nextInt();
            		stdin.nextLine();  // discard current input line

            		container = new MySearchableContainer();

            		for(int i = 0; i < size; i++)  {
               			System.out.print("Enter the next character: ");
               			char character = stdin.nextLine().charAt(0);
               			System.out.print("Enter the frequency of " + character + ": ");
               			int frequency = stdin.nextInt();
               			stdin.nextLine();// discard current input line
               			huffmanChar = new HuffmanChar(character, frequency);
               			if(! container.isMember(huffmanChar))
                  			container.insert(huffmanChar);
               			else
               			{
               	 			i--;
               	 			System.out.println("Error:  Please enter a distinct character");
               			}
            		}

            		//create a HuffmanCode object using the MySearchableContainer object and then get the Huffman code tree
            		
            		


		    		/*Use the HuffmanCodePrinter in an inorder traversal to print the leaves of the
		    		Huffman code tree obtained above.
            		Note: Remember that the tree to be traversed holds HuffmanNode objects */

            		
            		
            		

            		break;
            case 2:      // to be completed by students
            		// Input string from keyboard, encode the string, and display the codewords
            		System.out.println("Enter a string to encode:");
            		
            		
            		
            		
            		break;
            case 3 :     // to be completed by students
            		// Input string from a file, encode the string, and display the codewords
            		System.out.println("Enter the full path to the input file:");
            		String inputFile = stdin.nextLine();
            		
            		
            		
            		
            		break;
            case 4:  // to be completed by students
            		// decode the bit stream generated in either case 1, 2, or 3
            		// then display the decoded string
            		System.out.println("Enter bits sequence to decode:");
            		String bits = stdin.next();
            	
            	
            	
            	
            	
            		break;
        	 }
      }while (option != 5);

   }

   public static int menu(Scanner stdin){
      int choice = 1;
      boolean done = false;

      System.out.print("\n1. Input characters with associated frequencies." +
         "\n2. Input a string (frequencies computed automatically)." +
         "\n3. Input a string from a file." +
         "\n4. Input a bit sequence to decode." +
         "\n5. Exit Huffman encoder/decoder.\n\n");

      do  {
         System.out.print("Please enter your choice: ");
         choice = stdin.nextInt();
         done = true;
         if(choice < 1 || choice > 5)  {
            System.out.println("Error-  Choice must be 1,2,3,4 or 5");
            done = false;
         }
      }

      while(! done);
      stdin.nextLine();  // discard current input line
      return choice;
   }
}

