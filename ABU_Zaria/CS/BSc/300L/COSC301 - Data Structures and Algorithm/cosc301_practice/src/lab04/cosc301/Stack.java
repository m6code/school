package lab04.cosc301;

import lab01.cosc301.Container;

public interface Stack extends Container
{

    public abstract Object getTop();

    public abstract void push(Object obj);

    public abstract Object pop();
}