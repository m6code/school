package lab06.cosc301;

import lab02.cosc301.SearchableContainer;
import lab03.cosc301.InvalidOperationException;


public class BinarySearchTree extends BinaryTree implements SearchableContainer
{
    private BinarySearchTree getLeftBST()
    {
        return (BinarySearchTree)getLeft();
    }

    private BinarySearchTree getRightBST()
    {
        return (BinarySearchTree)getRight();
    }
   

    public boolean isMember(Comparable comparable)
    {
        return find(comparable) != null;
    }

    public Comparable find(Comparable comparable)
    {
        if(isEmpty())
            return null;
        Comparable key = (Comparable) getKey();    
        if(comparable.compareTo(key)==0)
            return key;
        else if (comparable.compareTo(key)<0)
            return getLeftBST().find(comparable);
        else    
            return getRightBST().find(comparable);
    }
    
    
    
    public Comparable findMin()
    {
        if(isEmpty())
            return null;
        if(getLeftBST().isEmpty())
            return (Comparable)getKey();
        else
            return getLeftBST().findMin();
    }
    
    public Comparable findMax()
    {
        if(isEmpty())
            return null;
        if(getRightBST().isEmpty())
            return (Comparable)getKey();
        else
            return getRightBST().findMax();
    }

    public void attachKey(Object obj)
    {
        if(!isEmpty())
            throw new InvalidOperationException();
        else
        {
            key = obj;
            left = new BinarySearchTree();
            right = new BinarySearchTree();
        }
    }

    public void insert(Comparable comparable)
    {
        if(isEmpty())
            attachKey(comparable);
        else
        {
         	Comparable key = (Comparable) getKey();    
        	if(comparable.compareTo(key)==0)
                throw new IllegalArgumentException("duplicate key");
        	else if (comparable.compareTo(key)<0)
                getLeftBST().insert(comparable);
        	else    
                getRightBST().insert(comparable);

        }
    }
    
	// Returns a reference to the node with obj as datum
	private BinarySearchTree findTree(Comparable obj) {
		if (isEmpty())
			return null;
		Comparable key = (Comparable) getKey();
		if(obj.compareTo(key)==0)
			return this;
		else if (obj.compareTo(key)<0)
			return getLeftBST().findTree(obj);
		else    
			return getRightBST().findTree(obj);
	}

	// Performs deletion by copying.
	public void withdraw(Comparable  comparable){
		if (isEmpty())
			throw new InvalidOperationException("The tree is empty");
	
		BinarySearchTree target = findTree(comparable);
		if (target == null)
			throw new InvalidOperationException(comparable+ " not found");
		else if (target.isLeaf())
			target.detachKey();
	
		else if (target.right.isEmpty()) { // no right child; replace the target with the left subtree
			BinarySearchTree temp = target.getLeftBST();
			target.key = temp.key;
			target.left = temp.left;
			target.right = temp.right;
			temp = null;
		}
		else if (target.left.isEmpty()) { // no left child; replace the target with the right subtree
			BinarySearchTree temp =target.getRightBST();
			target.key = temp.key;
			target.left = temp.left;
			target.right = temp.right;
			temp = null;
		}
		else { // the tree has two children now
			Comparable min = target.getRightBST().findMin();
			target.key = min; // copy the minimum value to the target
	
			target.getRightBST().withdraw(min); // remove the node having the min
		}
	}
}