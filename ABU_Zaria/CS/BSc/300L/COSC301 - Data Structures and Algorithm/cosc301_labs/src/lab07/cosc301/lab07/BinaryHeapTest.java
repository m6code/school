package lab07.cosc301.lab07;

import java.util.Scanner;
import lab01.cosc301.ContainerFullException;
import lab07.cosc301.BinaryHeap;

public class BinaryHeapTest
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		BinaryHeap binaryheap = null;
		Comparable[] array;
		int option, n; 
		
		do 
		{
			option = menu(stdin);
			switch(option)
			{
				case 1: //Create a Binary Min-Heap (Top down)
						binaryheap = createBinaryHeapTopDown(stdin);
						System.out.println("\nThe heap is : " + binaryheap);
						System.out.println();
						break;
				case 2: //Create a Binary Min-Heap (Bottom up)
						binaryheap = createBinaryHeapBottomUp(stdin);
						System.out.println("\nThe heap is : " + binaryheap);
						System.out.println();
						break;
						
				case 3: //Insert a key (Enqueue)
						if(binaryheap == null)
						   System.out.println("Error: The heap has not been created");
						else{   
						  System.out.println("Enter the key to be inserted");
				          n = stdin.nextInt();		
				          System.out.print("\nThe BinaryHeap before key insertion is: ");
						  System.out.println(binaryheap);
						  
						  try{
//1. **************************************************************************
						  	  // insert the key in the heap
						  	  // To be completed by students
						  	   
				            
				            
				            
						       System.out.print("\nThe BinaryHeap after key insertion is: ");
						       System.out.println(binaryheap);
						     }
						     catch(ContainerFullException e){
						        System.out.println("Error: The heap is full");
						      }
						   }
				           break;
			
				case 4: //Delete the minimum key (dequeueMin)
						if(binaryheap == null)
				          System.out.println("Error: The heap has not been created");
				        else if(binaryheap.isEmpty())
				          System.out.println("Error: The heap is empty");
				        else{		
				        	System.out.print("\nThe BinaryHeap before key deletion is: ");
							System.out.println(binaryheap);
//2. ************************************************************************
							// delete the minimum key from the heap
							// to be completed by students
							
				        	
				        	
							System.out.print("\nThe BinaryHeap after key deletion is: ");
							System.out.println(binaryheap);
						}
						break;			
				case 5: //Test whether an array is a Min-Heap or not
						array = readArray(stdin);
						testArray(array);
						System.out.println(); 
						break;
				case 6: //Heap sort an array
						System.out.println("\n1. Sort in decreasing order\n2. Sort in increasing order");
						System.out.print("Enter your choice (1 or 2): ");
						int sortingOrder = stdin.nextInt();
						array = readArray(stdin);	
						heapSort(array, sortingOrder);
						for(int i = 0; i < array.length; i++)
					  		System.out.print(array[i] + "  ");
						System.out.println("\n");
						break;
		        } 
	  }while (option != 7);	
	}
	
	public static BinaryHeap createBinaryHeapBottomUp(Scanner stdin)
	{
		Comparable[] array = readArray(stdin);
//3. ****************************************************************************		
		// Invokes an appropriate constructor of BinaryHeap class to create a binary heap bottom-up
		// To be completed by students
		
	
	
	}
	
	public static BinaryHeap createBinaryHeapTopDown(Scanner stdin)
	{
		int heapSize, numberOfElements, element;
		System.out.print("Enter the size of the BinaryHeap: ");
		heapSize = stdin.nextInt();
//4. **********************************************************************************		
		// Create a heap object called binaryHeap with size heapSize
		// To be completed by students
		
		
		
		
		do{
		   System.out.print("Enter the number of elements to insert in the BinaryHeap: ");
		   numberOfElements = stdin.nextInt();
		   if(numberOfElements > heapSize)
		     System.out.println(" Error: numberOfElements >" + heapSize);
		}while(numberOfElements > heapSize);
		
		for(int i = 1; i <= numberOfElements; i++)
		{
			System.out.print("Enter element#" + i + ": ");
			element = stdin.nextInt();
			try 
			{
//5. **********************************************
				// insert element in binaryHeap
				// to be completed by students
				
				
				
			}
			catch(ContainerFullException exception)
			{
				System.out.println("Cannot insert more elements. The min heap is full");
				break;
			}
		}
		
		return binaryHeap;	 
	}
	
	public static boolean isMinHeap(Comparable[] array) //assumes elements are stored starting at 1
	{
//6. *********************************************************************************
	 // Returns true if array is a minHeap otherwise returns false
	  // The index of the array starts at 1
	  // To be completed by students
	 
	  
	  
	  
	  
	}
	
	public static void testArray(Comparable[] array)
	{
		Comparable[] x = new Comparable[array.length + 1];
		
		// Making the index start at 1
		for(int i = 0; i < array.length; i++)
		  x[i+1] = array[i];
		 
		 
//7. *********************************************************************************		 
		 // Tests the array x and display a message stating whether it is a min heap or not.
		 
		 // To be completed by students
		 
		 
		 
		 
		 
	}
	
	public static void heapSort(Comparable[] array, int sortingOrder)
	{
		
//8. *****************************************************************************
		/* heapSorts array in decreasing order if sortingOrder equals to 1;
		otherwise in increasing order */
		
		// To be completed by students
		
	
	
	
	
	 
	} 
	
	
	public static Comparable[] readArray(Scanner stdin)
	{
		int numberOfElements;
		
		System.out.print("Enter the number of elements in the array: ");
		numberOfElements = stdin.nextInt();
		
		Comparable[] array = new Comparable[numberOfElements];
		
		for(int i = 0; i < numberOfElements; i++)
		{
			System.out.print("Enter element#" + (i + 1)  + ": ");
			array[i] = new Integer(stdin.nextInt());
		}
		
		return array;
	}
	
	public static int menu(Scanner stdin) 
	{
		int choice = 1;
		boolean done = false;
		
		System.out.print("\n1. Create a Binary Min-Heap (Top down)." +
							"\n2. Create a Binary Min-Heap (Bottom up)." +
							"\n3. Insert a key." +
							"\n4. Delete the minimum key." +
							"\n5. Test whether an array is a Min-Heap or not." +
							"\n6. Heap sort an array." +
							"\n7. Quit\n\n");
							
		do
		{
			System.out.print("Please enter your choice: ");
			choice = stdin.nextInt();
			done = true;
			if(choice < 1 || choice > 7)
			{
		  		System.out.println("Error-  Choice must be 1,2,3,4,5, 6 or 7");
		  		done = false;
		  	}
	    }while(! done); 
	    
	    return choice;
	}
}