package arrays;

import java.util.HashSet;
import java.util.Set;

public class Arrays3 {
	
//	Find if there is a subarray with sum 0
//	[2,3,1-4,3,-2]
//	PREFIX SUM
//	===================================================================================
	static boolean sumWithZero(int a[]) {
		int n = a.length;
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a[i];
			if(set.contains(sum)) {
				return true;
			}else {
				set.add(sum);
			}
		}
		return false;
	}
	
//	Transpose of a MATRIX;
//	Rows convert to Column and column to Row
//	===================================================================================
	 static void transposeMatrix(int a[][]) {
		 int n = a.length;
		 
		 for(int i = 0; i < n; i++) {
			 for(int j = i;j < n;j++) {
				 int swap = a[i][j];
				 a[i][j] = a[j][i];
				 a[j][i] = swap;
			 }
		 }
	 }
	 
	 static void printMatrix(int a[][]) {
		 int n = a.length;
		 for(int i = 0;i<n;i++) {
			 for(int j = 0; j <n;j++) {
				 System.out.print(a[i][j] + " ");
			 }
			 System.out.println();
		 }
	 }
	
	 
//	 Rotate a matrix 90deg;
//	 ==================================================================================
	  static void rotateMatrix(int a[][]) {
		  int n = a.length;
		  transposeMatrix(a);
		  
		  for(int i = 0; i < n; i++) {
				 for(int j = 0;j < n/2;j++) {
					 int swap = a[i][j];
					 a[i][j] = a[i][n-j-1];
					 a[i][n-j-1] = swap;
				 }
		  }
	  }
	
	  
//	  Search element in Row wise and column wise sorted matrix;
//	  ==================================================================================
	  static boolean searchElement(int a[][], int key) {
		  int row = 0;
		  int col = a.length - 1;
		  
		  while(row < a.length && col >= 0) {
			  if(a[row][col] == key) {
				  return true;
			  } else if(key > a[row][col]) {
				  row++;
			  } else {
				  col--;
			  }
		  }
		  return false;
	  }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {2,3,1-4,3,-2};
//		System.out.print(sumWithZero(arr));
		
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		}; 
//		printMatrix(arr);
//		transposeMatrix(arr);
//		printMatrix(arr);
		
//		rotateMatrix(arr);
		
		
		System.out.print(searchElement(arr,8));
		
	}

}
