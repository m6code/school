package lab01.cosc301.lab01;

import lab01.cosc301.*;

public class TestAdditionIterator {
	public static void main(String[] args) {
		MyContainer c = new MyContainer();
		for (int i=0; i<10; i++) 
			c.insert(new Integer(i));
			
	    Iterator i = c.iterator();
	    
	    int sum = 0;
	    while (i.hasNext()) {
	       Integer element = (Integer) i.next();
	       sum += element.intValue();
	    }
	    System.out.println("Sum of the iterator is : "+sum);
	 }
}
				