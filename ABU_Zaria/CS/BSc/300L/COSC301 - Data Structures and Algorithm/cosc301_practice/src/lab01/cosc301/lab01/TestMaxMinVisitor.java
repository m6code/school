package lab01.cosc301.lab01;

import lab01.cosc301.MaxMinVisitor;

public class TestMaxMinVisitor {
    public static void main(String[] args) {
        MyContainer container = new MyContainer();
        
        container.insert(6.7);
        container.insert(4.565);
        container.insert(44.34);
        container.insert(5.6);
        container.insert(2.3);
        container.insert(68.0);
        container.insert(9.0);
        container.insert(78.00);
        container.insert(1000.1);
        
        System.out.println("Content of container: " + container);
        
        MaxMinVisitor visitor = new MaxMinVisitor();
        
        container.accept(visitor);
        
        System.out.println("Max Value is: " + visitor.getMax());
        System.out.println("Min Value is: " + visitor.getMin());
    }
}
