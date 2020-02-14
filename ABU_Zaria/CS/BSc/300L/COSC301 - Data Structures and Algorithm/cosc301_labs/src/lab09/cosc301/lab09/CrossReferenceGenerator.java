package lab09.cosc301.lab09;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
import lab09.cosc301.AVLTree;

public class CrossReferenceGenerator{
	static Scanner stdin = new Scanner(System.in);

	public static void main(String[] args) throws IOException{
		AVLTree avltree = null;
		int choice;

		do{
			showMenu();

			choice = getChoice();
			switch (choice) {
				case 1:	avltree = createCrossReference();
						System.out.println("CROSS-REFERENCE HAS BEEN CREATED");
						break;
				case 2: if(avltree == null)
				          System.out.println("ERROR - The cross-reference has not been created");
				        else
				          displayCrossReference(avltree);

						break;
				case 3: if(avltree == null)
				          System.out.println("ERROR - The cross-reference has not been created");
				        else{
				          System.out.print("Enter the word to search for: ");
    					  String word = (stdin.next()).toLowerCase();
				          searchWord(word, avltree);
				        }
						break;
			}

		} while (choice != 4);
	}

	public static AVLTree createCrossReference() throws IOException{
		File file = null;
		Scanner in = null;

		System.out.println("Enter the full path to the text file: ");

		String path = stdin.nextLine().trim();

		try{
			file = new File(path);
			in = new Scanner(file);
		}
		catch(FileNotFoundException e){
			System.out.println("Error - File " +  path + " not found");

			System.exit(1);
		}


		AVLTree avltree = new AVLTree();

		String word;

		String inputLine = null;

		int lineNumber = 0;

		while(in.hasNextLine()){
			lineNumber++;
			inputLine = in.nextLine();
			StringTokenizer tokenizer = new StringTokenizer(inputLine, " .,;!:");
			while(tokenizer.hasMoreElements()){
			  word = (tokenizer.nextToken()).toLowerCase();

			  // To be completed by students







			}
		}

		in.close();
		return avltree;
	}

	public static void displayCrossReference(AVLTree avltree){

		// Displays avltree in increasing order of keys.
		// To be completed by students




    }

    public static void searchWord(String word, AVLTree avltree){

    	/* Searches for word in avltree and displays the corresponding avltree node
		   if the word is found.
		To be completed by students */





    }

    public static int getChoice(){
      int choice;
      do {
         System.out.print("\rYour choice? : ");
         choice = stdin.nextInt();
         if(choice < 1 || choice > 4)
           System.out.println("ERROR - Choose 1, 2, 3, or 4");
	  } while (choice < 1 || choice > 4);
	  stdin.nextLine();
      return choice;
	}

	public static void showMenu(){
 		System.out.println("\n********************************");
 		System.out.println("*   Cross-reference Generator  *");
 		System.out.println("********************************");
 		System.out.println("1.  Create a cross reference for a text file");
 		System.out.println("2.  Display the cross reference");
 		System.out.println("3.  Search for a word in the cross reference");
		System.out.println("4.  Quit");
 	}
}