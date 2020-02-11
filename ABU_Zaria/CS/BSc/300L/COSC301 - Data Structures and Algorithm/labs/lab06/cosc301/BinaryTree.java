package lab06.cosc301;

import java.util.NoSuchElementException;
import lab01.cosc301.AbstractContainer;
import lab01.cosc301.Iterator;
import lab01.cosc301.Visitor;
import lab03.cosc301.InvalidOperationException;
import lab04.cosc301.QueueAsLinkedList;
import lab04.cosc301.Stack;
import lab04.cosc301.StackAsLinkedList;



public class BinaryTree extends AbstractContainer implements Comparable {
   protected Object key;
   public BinaryTree left;
   public BinaryTree right;

   public BinaryTree(Object obj, BinaryTree left, BinaryTree right)  {
      key = obj;
      this.left = left;
      this.right = right;
   }

   // Creates an empty BinaryTree
   public BinaryTree()  {
      this(null, null, null);
   }

   // Creates a leaf node
   public BinaryTree(Object obj)  {
      this(obj, new BinaryTree(), new BinaryTree());
   }

   public void purge()  {
      key = null;
      left = null;
      right = null;
   }

   public boolean isLeaf()  {
      return !isEmpty() && left.isEmpty() && right.isEmpty();
   }

   public boolean isEmpty()  {
      return key == null;
   }

   public Object getKey()  {
      if(isEmpty())
      	throw new InvalidOperationException();
      else
      	return key;
   }

   public BinaryTree getLeft()  {
      if(isEmpty())
      	throw new InvalidOperationException();
      else
      	return left;
   }

   public BinaryTree getRight()  {
      if(isEmpty())
      	throw new InvalidOperationException();
      else
      	return right;
   }

   public void attachKey(Object obj)  {
      if(!isEmpty())
      throw new InvalidOperationException();
      else  {
         key = obj;
         left = new BinaryTree();
         right = new BinaryTree();
      }
   }

   public Object detachKey()  {
      if(!isLeaf())
      throw new InvalidOperationException();
      else  {
         Object obj = key;
         key = null;
         left = null;
         right = null;
         return obj;
      }
   }

   public void preorderTraversal(Visitor v)  {
      if(!isEmpty() && ! v.isDone())  {
         v.visit(getKey());
         getLeft().preorderTraversal(v);
         getRight().preorderTraversal(v);
      }
   }

   public void inorderTraversal(Visitor v)  {
      if(!isEmpty() && ! v.isDone())  {
         getLeft().inorderTraversal(v);
         v.visit(getKey());
         getRight().inorderTraversal(v);
      }
   }

   public void postorderTraversal(Visitor v)  {
      if(!isEmpty() && ! v.isDone())  {
         getLeft().postorderTraversal(v) ;
         getRight().postorderTraversal(v);
         v.visit(getKey());
      }
   }

    public void breadthFirstTraversal(Visitor visitor)
    {
        QueueAsLinkedList queueaslinkedlist = new QueueAsLinkedList();
        if(!isEmpty())
            queueaslinkedlist.enqueue(this);
        while(!queueaslinkedlist.isEmpty() && !visitor.isDone()) 
        {
            BinaryTree tree = (BinaryTree)queueaslinkedlist.dequeue();
            visitor.visit(tree.getKey());
            if (!tree.getLeft().isEmpty())
            	queueaslinkedlist.enqueue(tree.getLeft());
            if (!tree.getRight().isEmpty())
            	queueaslinkedlist.enqueue(tree.getRight());
        }
    }

    public void accept(Visitor visitor)
    {
        preorderTraversal(visitor);
    }
    
   public boolean isMember(Object obj)  {
      if(isEmpty())
	      return false;
      else if(obj.equals(key))
    	  return true;
      else
     	 return left.isMember(obj) || right.isMember(obj);
   }

    public int getHeight()
    {
        if(isEmpty())
            return -1;
        else
        	return 1 + Math.max(left.getHeight(),right.getHeight());
    }

   // to be implemented by students as a recursive method
   public int getCount()  {
      
      
      
      
      
   }

   // to be implemented by students as a recursive method
   public int leavesCount()  {
      
      
      
      
      
   }
   
    public int compareTo(Object obj){  
        BinaryTree binarytree = (BinaryTree)obj;
        if(isEmpty())
            return !binarytree.isEmpty() ? -1 : 0;
        if(binarytree.isEmpty())
            return 1;
        int i = ((Comparable)getKey()).compareTo(binarytree.getKey());
        if(i == 0)
            i = getLeft().compareTo(binarytree.getLeft());
        if(i == 0)
            i = getRight().compareTo(binarytree.getRight());
        return i;
    }  

	public Iterator iterator()
    {
        return new BinaryTreeIterator();
    }

    private class BinaryTreeIterator implements Iterator
    {
		protected Stack stack;

        public BinaryTreeIterator()
        {
            stack = new StackAsLinkedList();
            if(!isEmpty())
                stack.push(BinaryTree.this);
        }
        
        public boolean hasNext()
        {
            return !stack.isEmpty();
        }

        public Object next()
        {
            if(stack.isEmpty())
                throw new NoSuchElementException();
                
            BinaryTree tree = (BinaryTree)stack.pop();
            if (!tree.getRight().isEmpty())
            	stack.push(tree.getRight());
            
            if (!tree.getLeft().isEmpty())
            	stack.push(tree.getLeft());

            return tree.getKey();
        } 
    }
}

