# Maximum difference array

## Problem Statement
Given an array of integers of size N, your task is to find the maximum parity index of this array.
Parity Index is the maximum difference between two indices i and j (1 <= i <= j <= N) of an array A such that Ai < Aj.

## Input
First line of contains a single integer N, next line contains N space separated integers depicting the values of array.

## Output
Print the maximum value of j- i under the given condition, if no pair satisfies the condition print -1.

## Example

#### Sample Input:-
5

1 2 3 4 5

Sample Output:-
4

#### Explanation:
The maximum difference of jth - ith index is 4:(4th - 0th), also arr[4] > arr[0]


#### Sample Input:-
5

5 4 3 2 1

Sample Output:-
-1