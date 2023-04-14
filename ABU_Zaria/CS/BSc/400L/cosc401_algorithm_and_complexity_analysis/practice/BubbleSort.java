/**
* ALGORITHM BubbleSort(A[0..n − 1])
* //Sorts a given array by bubble sort
* //Input: An array A[0..n − 1] of orderable elements
* //Output: Array A[0..n − 1] sorted in nondecreasing order
* for i <-- 0 to n - 2 do
*   for j <-- to n - 2 - i do 
*       if A[j + 1] < A[j] 
*       // swap A[j] and A[j + 1]
*       
*/ 


// Java
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{32, 43, -20, -21, 12 , 0, 1, 4, 50, 99, 20, -1, -5};
        System.out.println("unsorted array = " + Arrays.toString(arr));
        int[] arrSorted = bubbleSort(arr);
        System.out.println("sorted array = " + Arrays.toString(arrSorted)); 
    }
    
    /**
     * This methods accepts an integer array and sort it using the insertion sort algorithm 
     * @author m6code
     * @param A - array of integer 
     * @return  an array of sorted integer in accending order
     */
    private static int[] bubbleSort(int[] A) {
        for(int i = 0; i < A.length - 1; i++) {
            for(int j = 0; j < A.length - 1 - i; j++) {
                if(A[j + 1] < A[j]) {
                    // Swap A[j] and A[j+1]
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }
        return A;
    }
}

