package lab02.cosc301.lab02;
import java.io.*;
import java.util.Scanner;
import lab01.cosc301.PrintingVisitor;
import lab02.cosc301.Association;


public class TestAssociation{

	public static void main(String[] args)throws IOException{
		MySearchableContainer container = new MySearchableContainer();
		Scanner reader = new Scanner(new File("input.txt"));
		reader.useDelimiter("[ :;,.?\"\n\r\t!-]+");
		Association association;
		
		while(reader.hasNext()){
			String word = reader.next();
			
			// to be completed by students
                        association = new Association(word, 1);
                        if(container.isMember(association)){
                            Association asso = (Association)container.find(association);
                            int n = (int) asso.getValue();
                            asso.setValue(n+1);
                            
                        }else {
                            container.insert(association);
                        }
		
			
		}
		
		
		// Display the container contents using a PrintingVisitor object
		// to be completed by students
                container.accept(new PrintingVisitor());
		
		
	}
}				