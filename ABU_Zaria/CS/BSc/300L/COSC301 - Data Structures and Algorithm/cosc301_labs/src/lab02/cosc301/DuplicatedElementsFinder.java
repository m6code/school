package lab02.cosc301;

import lab01.cosc301.AbstractVisitor;
import lab02.cosc301.lab02.MySearchableContainer;

public class DuplicatedElementsFinder extends AbstractVisitor{
    
    private MySearchableContainer con = new MySearchableContainer();
    private int count;

    @Override
    public void visit(Object object) {
        Comparable vist = (Comparable) object;
        if(con.isMember(vist)){
            count++;
            if(count>3){
                con.insert(vist);
            }
        }
    }
    
}
