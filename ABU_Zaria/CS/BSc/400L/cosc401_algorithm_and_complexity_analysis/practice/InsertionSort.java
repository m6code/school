/**
 * ALGORITHM InsertionSort(A[0...n-1])
 *  for i <-- 1 to n - 1 do 
 *      v <-- A[i]
 *      j <-- i - 1
 *      while j >= 0 and A[j] > v
 *          A[j + 1] = A[j] 
 *          j <-- j - 1
 *      A[j + 1] <-- 
 *
 */

import java.util.Arrays;

public class InsertionSort {
   
    // The Main Method to test code
    public static void main(String[] args) {
        int[] arr = new int[]{32, 43, -20, -21, 12 , 0, 1, 4, 50, 99, 20, -1, -5};
        System.out.println("unsorted array = " + Arrays.toString(arr));
        int[] arrSorted = insertionSort(arr);
        System.out.println("sorted array = " + Arrays.toString(arrSorted)); 
    }
    
    /**
     * This methods accepts an integer array and sort it using the insertion sort algorithm 
     * @author m6code
     * @param A - array of integer 
     * @return  an array of sorted integer in accending order
     */
    private static int[] insertionSort(int[] A) {   
        for(int i = 1; i < A.length; i++) {
            int v = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > v) {
                A[j + 1] = A[j];
                j--; // Same as j = j - 1;
            }
            A[j + 1] = v;
        }
        return A;
    } 
}

