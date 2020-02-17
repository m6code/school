package lab01.cosc301;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class MaxMinVisitor extends AbstractVisitor {
    
    private Comparable min = MAX_VALUE;
    private Comparable max = MIN_VALUE;

    @Override
    public void visit(Object object) {
        Comparable comp = (Comparable) object;
        
        if(comp.compareTo(min) <= -1){
            min = comp;
        }else if(comp.compareTo(max) > 0){
            max = comp;
        }
    }

    public Comparable getMin() {
        return min;
    }

    public Comparable getMax() {
        return max;
    }
    
}
