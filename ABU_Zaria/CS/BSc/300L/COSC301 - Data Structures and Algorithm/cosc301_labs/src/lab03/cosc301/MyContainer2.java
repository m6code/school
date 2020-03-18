package lab03.cosc301;

import lab01.cosc301.AbstractContainer;
import lab01.cosc301.Iterator;

public class MyContainer2 extends AbstractContainer{
    
    protected MyLinkedList list = new MyLinkedList();

    @Override
    public void purge() {
        list.purge();
    }

    @Override
    public Iterator iterator() {
        Iterator it = list.iterator();
        return it;
    }

//    @Override
//    public void insert(Comparable obj) {
//        list.append(obj);
//    }
    
    
    
}
