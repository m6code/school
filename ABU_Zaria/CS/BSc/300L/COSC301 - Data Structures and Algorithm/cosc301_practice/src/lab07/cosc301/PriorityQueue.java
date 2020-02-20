package lab07.cosc301;

import lab01.cosc301.Container;

public interface PriorityQueue extends Container
{

    public abstract void enqueue(Comparable comparable);

    public abstract Comparable findMin();

    public abstract Comparable dequeueMin();

}