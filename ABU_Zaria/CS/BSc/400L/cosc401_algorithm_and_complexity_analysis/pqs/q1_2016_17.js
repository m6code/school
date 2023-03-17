/*
 * Write an algorithm that returns the index of the last occurrence 
 * of a key in a given array.
 * it returns -1 if key is not in given array
 * ALGORITHM
 * Algorithm findLastOccurrence(A[0,...,n-1], key) 
 * 	la = -1;
 * 	for i <--- 0 to n - 1 do
 * 		if(A[i] == key)
 * 			la <--- i
 *
 * 	return la;
 *
 */

// Implementation of the algorithm in Javascript

/* @description 
 * @param {array} arr - the array to search in
 * @param {number} key - the key to search for in the array
 * @return {number} the index of last occurrence of the key
 */
function findLastOcc(arr, key) {
	let la = -1;
	for(let i = 0; i < arr.length; i++) {
		if(arr[i] === key){
			la = i;
		}
	}
	return la;
}


// Implementation of the Algorithm using Javascript inbuilt methods/functions

/* 
	* @description - Returns the last occurence of a key
	* @param {array} arr - the array to find element/key
	* @param {number} key - the key to find in array
	* @return {number} the index of the last occurrence of key
	*/ 
	function findLastOccJs(arr, key) {
		return arr.lastIndexOf(key);
		
	}


// TESTING THE ALGORITHM
//1. key = 3 
const one = findLastOccJs([3,8,3,1,3,2], 3);
console.log(one);
// Expected output: 4

//2. key = 2;
const two = findLastOccJs([2,5,7,10,1,2], 2);
console.log(two);
// Expected output: 5

//3. key = 11;
const three = findLastOccJs([12,11,7,11,13,12], 11);
console.log(three);
// Expected output: 3

//4. key = 9;
const four = findLastOccJs([5,4,3,6,7,8,0], 9);
console.log(four);
// Expected output: -1

