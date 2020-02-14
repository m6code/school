package lab07.cosc301;

import lab01.cosc301.Container;

public interface PriorityQueue2 extends Container
{

    public abstract void enqueue(Comparable comparable);

    public abstract Comparable findMax();

    public abstract Comparable dequeueMax();

}