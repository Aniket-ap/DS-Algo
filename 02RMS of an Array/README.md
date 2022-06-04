# RMS of an array

## Problem Statement
Given an array A of size N. You need to find the root mean square (RMS) of the array i. e you first need to square all values of array and take its mean. Then you need to return the square root of mean. Print the answer with precision upto 6 decimal places.

## Input
First line contains an integer N - the size of array
Next line contains N space separated integers - the elements of array.

## Constraints
1 <= N <= 100
1 <= Ai <= 100

## Output
Print the RMS value of the array.

# Example
#### Sample Input 1:

4

1 2 3 4

#### Output:

2.738613

#### Explanation:

Sum of squares = 1 + 4 + 9 + 16 = 30

Mean = 30 / 4 = 7.5

Taking square root of 7.5 gives 2.738613

#### Sample Input 2:

2

7 13

#### Output:

10.440307

#### Explanation:

Sum of squares = 49 + 169 = 218

Mean = 218 / 2 = 109

Taking square root of 109 gives 10.440307