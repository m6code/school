package lab01.cosc301.lab01;

import lab01.cosc301.*;

public class TestPrintingVisitor2 {

    private static final int SIZE = 100;
    protected static Comparable[] array = new Comparable[SIZE];

    public static void main(String[] args) {
//		MyContainer c = new MyContainer();
//		for (int i=0; i<10; i++) 
//			c.insert(new Integer(i));
//			
//	    c.accept(new PrintingVisitor());

        AbstractContainer acon = new AbstractContainer() {
            @Override
            public void purge() {
                for (int i = 0; i < count; i++) {
                    array[i] = null;
                }
                count = 0;
            }

            @Override
            public Iterator iterator() {
                return new Iterator() {

                    private int pos = 0;

                    public boolean hasNext() {
                        return pos < count;
                    }

                    public Object next() {
                        Comparable element = array[pos];
                        pos++;
                        return element;
                    }
                };
            }
            
            public void insert(Comparable object) {
                if (isFull()) {
                    throw new ContainerFullException();
                } else {
                    array[count] = object;
                    count++;
                }
            }

        };
        
        for(int i = 0; i < 10; i++){
            acon.insert(i);
        }
        
         
        acon.accept(new PrintingVisitor());

    }

}
