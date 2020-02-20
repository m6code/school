package lab04.cosc301;

import java.util.NoSuchElementException;
import lab01.cosc301.AbstractContainer;
import lab01.cosc301.ContainerEmptyException;
import lab01.cosc301.ContainerFullException;
import lab01.cosc301.Iterator;

public class QueueAsArray extends AbstractContainer implements Queue {

    protected Object[] array;
    protected int rear = 0;
    protected int size;

    public QueueAsArray(int size) {
        array = new Object[size];
        this.size = size;
    }

    @Override
    public void purge() {
        int index = 0;
        while (count > 0) {
            array[index] = null;
            index++;
            count--;
        }
        rear = 0;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int position = 0;

            public boolean hasNext() {
                return position < count;
            }

            public Object next() {
                if (position == count) {
                    throw new NoSuchElementException();
                } else {
                    Object obj = array[position++];
                    return obj;
                }
            }

        };
    }


    @Override
    public Object getHead() {
        if (count == 0) {
            throw new ContainerEmptyException();
        } else {
            return array[0];
        }
    }

    @Override
    public void enqueue(Object obj) {
        if (count == size) {
            throw new ContainerFullException();
        } else {
            array[rear++] = obj;
            count++;
        }
    }

    @Override
    public Object dequeue() {
        if(count == 0){
            throw new ContainerEmptyException();
        }else{
            Object obj = array[0];
            count--;
            for (int k = 1; k <= count; k++) {
                array[k-1] = array[k];
            }
            rear--;
            return obj;
        }
    }

}
