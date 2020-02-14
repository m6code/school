package lab09.cosc301;

import lab01.cosc301.MethodNotImplemented;
import lab03.cosc301.InvalidOperationException;
import lab06.cosc301.BinarySearchTree;

public class AVLTree extends BinarySearchTree
{
	protected int height;
	  
    public AVLTree()
    {
        height = -1;
    }

    private AVLTree getLeftAVL()
    {
        return (AVLTree)getLeft();
    }

    private AVLTree getRightAVL()
    {
        return (AVLTree)getRight();
    }

    public int getHeight()
    {
        return height;
    }

    protected void adjustHeight()
    {
        if(isEmpty())
            height = -1;
        else
            height = 1 + Math.max(left.getHeight(), right.getHeight());   
    }

    protected int getBalanceFactor()
    {
        if(isEmpty())
            return 0;
        else
            return right.getHeight() - left.getHeight();
    }

    protected void rotateLeft() 
    {
        if(isEmpty())
            throw new InvalidOperationException();
        else
        {
            System.out.println("LEFT ROTATION");
            // To be completed by students
            
            
            
            
            
            
            
            
            
        }
	}

    protected void rotateRight() 
    {
        if(isEmpty())
            throw new InvalidOperationException();
        else
        {
        	System.out.println("RIGHT ROTATION");
            BinaryTree binarytree = right;
            right = left;
            left = left.left;
            right.left = right.right;
            right.right = binarytree;
            
            Object obj = key;
            key = right.key;
            right.key = obj;
            
            getRightAVL().adjustHeight();
            adjustHeight();
        }
	}

    protected void rotateLeftRight()
    {
        if(isEmpty())
            throw new InvalidOperationException();
        else
        {
            getLeftAVL().rotateLeft();
            rotateRight();
        }
    }

    protected void rotateRightLeft()
    {
        if(isEmpty())
            throw new InvalidOperationException();
        else
        {
            getRightAVL().rotateRight();
            rotateLeft();
        }
    }

    public void insert(Comparable comparable)
    {
    	super.insert(comparable);
		
    	balance();
    }

    protected void balance()
    {
        adjustHeight();
        
        int balanceFactor = getBalanceFactor();
        
        if(balanceFactor == -2)
		{
			System.out.println("Balancing  node with key: "+getKey());
            if(getLeftAVL().getBalanceFactor() < 0)
				rotateRight();
            else
                rotateLeftRight();
        }
		else if(balanceFactor == 2)
        {
        	System.out.println("Balancing  node with key: "+getKey());
            if(getRightAVL().getBalanceFactor() > 0)
                rotateLeft();
            else
                rotateRightLeft();
        }
    }

    public void attachKey(Object obj)
    {
        if(!isEmpty())
            throw new InvalidOperationException();
        else
        {
            key = obj;
            left = new AVLTree();
            right = new AVLTree();
            height = 0;
        }
    }

   
    public void withdraw(Comparable comparable)
    {
    	throw new MethodNotImplemented();
    }
    
    public Object detachKey()
    {
        height = -1;
        return super.detachKey();
    }  
}