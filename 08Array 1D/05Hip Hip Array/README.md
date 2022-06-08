# Hip Hip Array

## Problem Statement
You will be given an array of N numbers. Your task is to first reverse the array (first number becomes last, 2nd number becomes 2nd from the last and so on) and then print the sum of the numbers at even indices and print the product of the numbers at odd indices.

## Input
First line contains single integer N: number of elements
Second line contains N different integers separated by spaces

## Output
Two space separated integers representing sum of the numbers at even places and the product of the numbers at odd places.

## Example
#### Sample Input:
6

1 2 3 4 5 6

#### Sample Output:
9 48

#### Explanation:-
After reversing 1 2 3 4 5 6 becomes 6 5 4 3 2 1
Hence sum of the numbers at even indices : 5+3+1=9
product of the numbers at odd indices: 6*4*2=48

#### Sample Input:
3

1 2 3

#### Sample Output:
2 3