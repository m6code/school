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


// Javascript Implementation

/**
* @description sorts an array using insertionSort algorithm 
* @param {Array} A - an array of integers
* @return {Array} - an array of integers sorted in accending order
*/
function BubbleSort(A) {
    for(let i = 0; i < A.length - 1; i++) {
        for(let j = 0; j < A.length - 1 - i; j++) {
            if(A[j + 1] < A[j]) {
                // swap A[j] and A[j + 1]
                tmp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = tmp;
            }
        }
    }
    return A;
}

const arr = [4, 3, 8, 2, 9]
console.log(`unsorted array = ${arr}`);
console.log(`sorted array ${BubbleSort(arr)}`);
console.log();

let arr2 = [32, 43, -20, -21, 12 , 0, 1, 4, 50, 99, 20, -1, -5];
console.log(`unsorted array = ${arr2}`);
console.log(`sorted array = ${BubbleSort(arr2)}`);
