package lab03.cosc301.lab03;

import lab01.cosc301.lab01.*;
import lab03.cosc301.MyContainer2;

public class TestMyContainer2 {
	
	public static void main(String[] args) {

		MyContainer2 c = new MyContainer2();
		for (int i=0; i<10; i++) 
			c.insert(new Integer(i));
			
	    System.out.println(c);   
	 }
}
				