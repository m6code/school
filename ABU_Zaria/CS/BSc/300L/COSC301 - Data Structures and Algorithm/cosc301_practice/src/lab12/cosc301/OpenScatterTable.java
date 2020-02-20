package lab12.cosc301;

import lab01.cosc301.Iterator;
import lab01.cosc301.ContainerEmptyException;
import lab01.cosc301.ContainerFullException;
import java.util.NoSuchElementException;

public class OpenScatterTable extends AbstractHashTable {

    protected Entry array[];
    protected static final int EMPTY = 0;
    protected static final int OCCUPIED = 1;
    protected static final int DELETED = 2;

	protected static final class Entry {
        public int state = EMPTY;
        public Comparable object;

        void purge() {
            state  = EMPTY;
            object = null;
        }
    }

	public OpenScatterTable(int size) {
        array = new Entry[size];
        for(int i = 0; i < size; i++)
            array[i] = new Entry();
    }

	public int getLength() {
        return array.length;
    }
    
    public void purge() {
        for(int i = 0; i < getLength(); i++)
            array[i].purge();
        count = 0;
    }

	public boolean isFull() {
        return count == getLength();
    }
    
	protected int c(int i){
        return i;
    }
    
    // finds the index of the first unoccupied slot in the probe sequence of obj
    protected int findIndexUnoccupied(Comparable obj){
      int hashValue = h(obj);
      int tableSize = getLength();
      int indexDeleted = -1;
      for(int i = 0; i < tableSize; i++){
         int index = (hashValue + c(i)) % tableSize;
         if(array[index].state == OCCUPIED && obj.equals(array[index].object))
            throw new IllegalArgumentException("Error: Duplicate key");

         else if(array[index].state == EMPTY ||
           (array[index].state == DELETED && obj.equals(array[index].object)))
             return indexDeleted == -1 ? index : indexDeleted;
         else if(array[index].state == DELETED && indexDeleted == -1)
             indexDeleted = index; 
      }
      
      if(indexDeleted != -1) 
          return indexDeleted;

      throw new IllegalArgumentException("Error: Hash table is full");
   }
    
    // finds the index of obj
    protected int findObjectIndex(Comparable obj){
        int hashValue = h(obj);
        int tableSize = getLength();

        for(int i = 0; i < tableSize; i++){
            int index = (hashValue + c(i)) % tableSize;
            if(array[index].state == EMPTY 
                || (array[index].state == DELETED && obj.equals(array[index].object)))
                return -1;
            else if(array[index].state == OCCUPIED && obj.equals(array[index].object))
                return index;
        }
        return -1;
    }
    
    public void insert(Comparable obj){
        if(count == getLength()) 
            throw new ContainerFullException();
        else{
            int index = findIndexUnoccupied(obj);   // throws exception if an UNOCCUPIED slot is not found
            array[index].state = OCCUPIED;
            array[index].object = obj;
            count++;
        }
    }
    
    public void withdraw(Comparable obj){
        if(count == 0)
            throw new ContainerEmptyException();
        int index = findObjectIndex(obj);
        if(index < 0)
            throw new IllegalArgumentException("Object not found"); 
        else{
            array[index].state = DELETED;
            // lazy deletion: DO NOT SET THE LOCATION TO null
            count--;
        }
    }
    
    public Comparable find(Comparable obj){
        int index = findObjectIndex(obj);
        if(index >= 0)
            return array[index].object;
        else
            return null;
    }
    
    public boolean isMember(Comparable obj){
        return findObjectIndex(obj) >= 0;
    }

    public Iterator iterator(){
        return new Iterator() {

           protected int index;
			
           {
                for(index = 0; index < getLength(); index++)
                    if(array[index].state == OCCUPIED)
                      break;
           }

           public boolean hasNext(){
                return index < getLength();
           }

           public Object next(){
                if(index >= getLength())
                    throw new NoSuchElementException();
                Object obj = array[index].object;
                for(index++; index < getLength(); index++)
                    if(array[index].state == OCCUPIED)
                        break;
                return obj;
           }
        };
    }
    
    public String toString(){
    	String string = "index\t\tobject\n";
    	for(int index = 0; index < getLength(); index++){
    		if(array[index].state == OCCUPIED)
    		  string += index + "\t\t" + array[index].object + "\n";
    	}
    	
    	return string;
    }
}