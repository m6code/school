package lab01.cosc301.lab01;

import lab01.cosc301.*;

public class TestAdditionVisitor {
	
	public static void main(String[] args) {
		MyContainer c = new MyContainer();
		for (int i=0; i<10; i++) 
			c.insert(new Integer(i));
		
		AdditionVisitor visitor = new AdditionVisitor();
		c.accept(visitor);
	    System.out.println("The sum of the elements is: "+visitor.getSum());
	}
}
				