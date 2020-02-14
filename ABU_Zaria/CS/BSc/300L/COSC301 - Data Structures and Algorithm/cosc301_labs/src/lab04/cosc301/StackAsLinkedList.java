package lab04.cosc301;

import lab01.cosc301.AbstractContainer;
import lab01.cosc301.ContainerEmptyException;
import lab01.cosc301.Iterator;
import lab03.cosc301.MyLinkedList;
import java.util.NoSuchElementException;

public class StackAsLinkedList extends AbstractContainer implements Stack
{
	protected MyLinkedList list;
	
    public StackAsLinkedList()
    {
        list = new MyLinkedList();
    }

    public void purge()
    {
        list.purge();
        count = 0;
    }

    public void push(Object obj)
    {
        list.prepend(obj);
        count++;
    }

    public Object pop()
    {
        if(count == 0)
        
            throw new ContainerEmptyException();
        else
        {
            Object obj = list.getFirst();
            list.extractFirst();
            count--;
            return obj;
        }
    }

    public Object getTop()
    {
        if(count == 0)
            throw new ContainerEmptyException();
        else
            return list.getFirst();
    }

    public Iterator iterator()
    {
        return new Iterator() {
        	
        	protected MyLinkedList.Element position = list.getHead();

            public boolean hasNext()
            {
                return position != null;
            }

            public Object next()
            {
                
                
                if(position == null)
                    throw new NoSuchElementException();
                else
                {
                    Object obj = position.getData();
                    position = position.getNext();
                    return obj;
                }
            } 
        };
    }
}