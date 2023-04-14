/**
* ALGORITHM SelectionSort(A[0...n-1])
*   //Sorts a given array by selection sort
*	//Input: An array A[0..n − 1] of orderable elements
*	//Output: Array A[0..n − 1] sorted in nondecreasing order
*   for i <-- 0 to n - 2 do
*		min <-- i
*		for j <-- i + 1 to n - 1 do
*			if(A[j] < A[min])
*				min <-- j
*		// swap A[i] with A[min]
*		tmp <-- A[i]
*		A[i] <-- A[min]
*		A[min] <-- temp
*
*
* ALGORITHM SelectionSort(A[0..n − 1])
*	//Sorts a given array by selection sort
*	//Input: An array A[0..n − 1] of orderable elements
*	//Output: Array A[0..n − 1] sorted in nondecreasing order
*	for i ← 0 to n − 2 do
*		min ← i
*		for j ← i + 1 to n − 1 do
*			if A[j ] < A[min] min ← j
*		swap A[i] and A[min]
*/

// Javascript Implementation of SelectionSort
/**
*@description sorts an array of numbers using SelectionSort
*@param {Array} - an array of numbers 
*@return {Array} - a sorted array of numbers .
*/
function SelectionSort(A) {
  for(let i = 0; i < A.length - 1; i++) {
      min = i;
      for(j = i + 1; j < A.length; j++) {
          if(A[min] > A[j]) {
              min = j;
          }
      }
      // SWAP A[min] with A[j]
      let tmp = A[i];
      A[i] = A[min];
      A[min] = tmp; 
  }
    return A;
}


let arr = [32, 43, -20, -21, 12 , 0, 1, 4, 50, 99, 20, -1, -5];
console.log(`unsorted array = ${arr}`);
console.log(`sorted array = ${SelectionSort(arr)}`);
