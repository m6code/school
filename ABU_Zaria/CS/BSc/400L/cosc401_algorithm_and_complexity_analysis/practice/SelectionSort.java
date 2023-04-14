/**
 * ALGORITHM SelectionSort(A[0...n-1])
 *  //Sorts a given array by selection sort
 *	//Input: An array A[0..n − 1] of orderable elements
 *	//Output: Array A[0..n − 1] sorted in nondecreasing order
 *	for i <-- 0 to n - 2 do 
 *	    min <-- i
 *	    for j <-- i + 1 to n - 1 do 
 *	        if A[j] < A[min]
 *	            min <-- j
 *	    // swap A[i] with A[min]
 *      tmp <-- A[i]
 *      A[i] <-- A[min]
 *      A[min] <-- tmp
 */


import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{32, 43, -20, -21, 12 , 0, 1, 4, 50, 99, 20, -1, -5};
        System.out.println("unsorted array = " + Arrays.toString(arr));
        int[] arrSorted = selectionSort(arr);
        System.out.println("sorted array = " + Arrays.toString(arrSorted)); 
    }
    
    /**
     * This methods accepts an integer array and sort it using the insertion sort algorithm 
     * @author m6code
     * @param A - array of integer 
     * @return  an array of sorted integer in accending order
     */
    private static int[] selectionSort(int[] A) {
        for(int i = 0; i < A.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < A.length; j++) {
                if(A[j] < A[min]) min = j;
            }
            // Swap A[i] with A[min]
            int tmp = A[i];
            A[i] = A[min];
            A[min] = tmp;
        }
        return A;
    }
}
