package lab02.cosc301.lab02;

import lab01.cosc301.Iterator;
import lab02.cosc301.Association;
import java.util.Scanner;
import java.io.*;

// Note: The input file must not contain more than 100 words
public class ByWordLength {
	
	public static void main(String[] args) throws IOException{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter input file name: ");
		String fname = stdin.nextLine();
		File file = new File(fname);
		Scanner in = new Scanner(file);
		in.useDelimiter("[ :;,.?\"\n\r\t!-]+");
		
		String token;
		MySearchableContainer c = new MySearchableContainer();
		int maxLength = 0;
		while(in.hasNext()){
			token = in.next();
			c.insert(new Association(new Integer(token.length()), token));
			if(token.length() > maxLength)
			  maxLength = token.length();
		}
		
		for(int i=1; i<= maxLength; i++) {
			Iterator it = c.iterator();
		    while (it.hasNext()){
				Association assoc = (Association) it.next();
				if(assoc.equals(new Association(new Integer(i))))
					System.out.println(assoc.getValue());
			}
			System.out.println();
		}
	}
}
