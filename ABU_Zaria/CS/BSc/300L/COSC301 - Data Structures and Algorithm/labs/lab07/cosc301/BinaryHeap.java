package lab07.cosc301;

import lab01.cosc301.Iterator;
import lab01.cosc301.ContainerEmptyException;
import lab01.cosc301.ContainerFullException;
import lab01.cosc301.AbstractContainer;
import java.util.NoSuchElementException;


public class BinaryHeap extends AbstractContainer implements PriorityQueue
{

	protected Comparable array[];
	  
    public BinaryHeap(int i)
    {
        array = new Comparable[i + 1];
    }
    
    public BinaryHeap(Comparable[] comparable) 
    {
    	this(comparable.length);
    	 
    	for(int i = 0; i < comparable.length; i++)
    	   array[i + 1] = comparable[i];
    	   
    	count = comparable.length;
    	
    	buildHeapBottomUp();
	}
	
	private void buildHeapBottomUp()
	{
       for(int i = count / 2; i >= 1; i--)
			percolateDown(i);
	}
	
	
	private void percolateDown(int hole)
	{
		int minChildIndex;
		Comparable temp = array[hole];
		while(hole * 2 <= count)
		{
			minChildIndex = hole * 2;
			if(minChildIndex + 1 <= count && array[minChildIndex + 1].compareTo(array[minChildIndex])<0)
				minChildIndex++;
			if(array[minChildIndex].compareTo(temp)<0)
				array[hole] = array[minChildIndex];
			else
				break;
			
			hole = minChildIndex;
		}
		
		array[hole] = temp;
	}
	
	private void percolateUp(int hole){
		Comparable comparable = array[hole];
	    while(hole > 1 && array[hole / 2].compareTo(comparable)>0)
        {
            array[hole] = array[hole / 2];
            hole = hole / 2 ;
    	}

        array[hole] = comparable;	
	}
	

	public void purge()
    {
        while(count > 0) 
            array[count--] = null;
    }

    public void enqueue(Comparable comparable)
    {
        if(isFull())
            throw new ContainerFullException();
            
        int hole = ++count;
        
        // percolate up via a hole
        while(hole > 1 && array[hole / 2].compareTo(comparable)>0)
        {
            array[hole] = array[hole / 2];
            hole = hole / 2 ;
    	}

        array[hole] = comparable;
    }

    public Comparable findMin()
    {
        if(isEmpty())
            throw new ContainerEmptyException();
        else
            return array[1];
    }

    public Comparable dequeueMin()
    {
        if(isEmpty())
            throw new ContainerEmptyException();
        Comparable minItem = array[1];
        array[1] = array[count];
        count--;
        percolateDown(1);
        return minItem;
    }
    
    
    public boolean isFull()
    {
        return count == array.length - 1;
    }
    
    public Iterator iterator()
    {
        return new Iterator() 
        {
			protected int pos = 1;
			
            public boolean hasNext()
            {
                return pos <= count;
            }

            public Object next()
            {
                if(pos > count)
                    throw new NoSuchElementException();
                else
                    return array[pos++];
            } 
        };
    }
    
    public String toString(){
    	if(isEmpty())
    	  return "{ }";
    	  
    	String s = "{ ";
    	for(int k = 1; k <= count; k++)
    	  s = s + "  " + array[k];
    	return s +"}";
    	
    }
}