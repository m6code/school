package lab04.cosc301;

import lab01.cosc301.Container;

public interface Queue extends Container
{

    public abstract Object getHead();

    public abstract void enqueue(Object obj);

    public abstract Object dequeue();

}