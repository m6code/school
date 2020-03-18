package lab03.cosc301;

import lab02.cosc301.SearchableContainer;
import lab03.cosc301.MyLinkedList.Element;

public class MySearchableContainer2 extends MyContainer2 implements SearchableContainer {

    private Element findIndex(Comparable target) {
        if (list.getHead() != null && list.find(target).equals(target)) {
            return list.find(target);
        } else {
            return null;
        }

    }

    @Override
    public boolean isMember(Comparable object) {
        return findIndex(object) != null;
    }

    @Override
    public void withdraw(Comparable obj) {
        Element index = findIndex(obj);

        if (index != null) {
            list.extract(obj);
        }

    }

    @Override
    public Comparable find(Comparable object) {
        if (isMember(object)) {
            return object;
        } else {
            return null;
        }

    }

}
