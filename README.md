# LearningSessionsCodeChallenges
Repository of code challenges commonly encountered in developer interviews.

## Challenge 01: Valid Parentheses

**Problem Statement:**

Determine if a string `s` that contains just the characters '(', ')', '{', '}', '[' and ']', is valid. A string is valid if:

- Open brackets are closed by the same type of brackets.
- Open brackets are closed in the correct order.
- Each close bracket has a corresponding open bracket of the same type.

**Examples:**

- Input: `s = "()"`  
  Output: `true`

- Input: `s = "()[]{}"`  
  Output: `true`

- Input: `s = "(]"`  
  Output: `false`

---

## Challenge 02: Reverse an Array

**Problem Statement:**

An array is a data structure that stores elements of the same type in a contiguous block of memory. Given an array `A` of size `N`, reverse the array.

**Note:** If you have already solved the Arrays Introduction challenge in our C++ domain, you may want to skip this.

**Function Description:**

Complete the function `reverseArray` as described below:

- `reverseArray(int A[n])`: The array to reverse.

**Returns:**

- `int[n]`: The reversed array.

**Input Format:**

- The first line contains an integer, `N`, the number of integers in `A`.
- The second line contains `N` space-separated integers that make up `A`.

**Examples:**

- Input: `A = [1, 2, 3]`  
  Return: `[3, 2, 1]`

**Constraints:**

- `1 ≤ N ≤ 10^3`
- `1 ≤ A[i] ≤ 10^4`, where `A[i]` is the `i`th integer in `A`.

---

## Challenge 03: 2-dimensional array

Declare a 2-dimensional array, arr, of n empty arrays. All arrays are zero indexed.
Declare an integer, lastAnswer, and initialize it to 0.
There are 2 types of queries, given as an array of strings for you to parse:
Query: 1 x y
Let idx = ((x XOR lastAnswer) % n).
Append the integer y to arr[idx].
Query: 2 x y
Let idx = ((x XOR lastAnswer) % n).
Assign the value arr[idx][y % size(arr[idx])] to lastAnswer.
Store the new value of lastAnswer to an answers array.
Note: ^ is the bitwise XOR operation, which corresponds to the ^ operator in most languages. Learn more about it on Wikipedia. % is the modulo operator. Finally, size(arr[idx]) is the number of elements in arr[idx]

Function Description

Complete the dynamicArray function below.

dynamicArray has the following parameters:

int n: the number of empty arrays to initialize in arr
string queries[q]: query strings that contain 3 space-separated integers
Returns

int[]: the results of each type 2 query in the order they are presented
Input Format

The first line contains two space-separated integers, n, the size of arr to create, and q, the number of queries, respectively.
Each of the q subsequent lines contains a query string, queries[i].

Constraints

1 <= n, q <= 10^5
0 <= x, y <= 10^9
It is guaranteed that query type 2 will never query an empty array or index.

Sample Input

2 5
1 0 5
1 1 7
2 0 1
2 1 0
1 0 3

Output

7
3

---

## Challenge 04: left Rotation
A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. Given an integer, d, rotate the array that many steps left and return the result.

Example

d = 2

arr = [1, 2, 3, 4, 5]

After 2 rotations, arr' = [3, 4, 5, 1, 2].

Function Description

Complete the rotateLeft function in the editor below.

rotateLeft has the following parameters:

int d: the amount to rotate by
int arr[n]: the array to rotate
Returns

int[n]: the rotated array
Input Format

The first line contains two space-separated integers that denote n, the number of integers, and d, the number of left rotations to perform.
The second line contains n space-separated integers that describe arr[].

Constraints

1 ≤ n ≤ 10^5
1 ≤ d ≤ n
1 ≤ a[i] ≤ 10^6

Sample Input

5 4
1 2 3 4 5

Sample Output

5 1 2 3 4