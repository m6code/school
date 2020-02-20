package lab01.cosc301.lab01;

public class TestMyContainer {
	
	public static void main(String[] args) {

		MyContainer c = new MyContainer();
		for (int i=0; i<10; i++) 
			c.insert(new Integer(i));
			
	    System.out.println(c);   
	 }
}
				