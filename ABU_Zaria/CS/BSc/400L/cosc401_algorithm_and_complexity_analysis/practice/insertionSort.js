/**
* ALGORITHM InsertionSort(A[0...n-1]) 
*   for i <-- 1 to n - 1 do 
*       v <-- A[i] 
*       j <-- i - 1
*       while j >= 0 and A[j] > v do 
*           A[j + 1] <-- A[j]
*           j <-- j - 1
*       A[j + 1] <-- v
*/

// Javascript Implementation

/**
* @description sorts an array using insertionSort algorithm 
* @param{Array} - an array of integers
* @return{Array} - an array of integers sorted in accending order
*/
function insertionSort(A) {
    for(let i = 1; i < A.length; i++) {
        const v = A[i];
        let j = i - 1;
        while (j >= 0 && A[j] > v) {
            A[j + 1] = A[j];
            j--; // same as j = j - 1;
        }
        A[j + 1] = v;
    }
    return A;
}

const arr = [4, 3, 8, 2, 9]
console.log(`unsorted array = ${arr}`);
console.log(`sorted array ${insertionSort(arr)}`);
