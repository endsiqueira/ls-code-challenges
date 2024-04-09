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

