package arrays;

public class Arrays2 {
	
//	Leaders in an array ( the elements which don not have any larger element from theie right side )
//	2 7 6 1 4 3
//  7 6 4 3 ( OUTPUT )
//	================================================================================================
	static void leadersArray(int a[]) {
		int n = a.length;
		int largest = Integer.MIN_VALUE;
		
		for(int i = n-1; i >= 0; i--) {
			if(a[i] > largest) {
				largest = a[i];
				System.out.print(a[i] + " ");
			}
		}
		
	}

//	Maximum SUM subArray ( KADENES ALGORITHM )
//	6 -7 4 -2 1 5 -4
//	================================================================================================
	static int maxSumSubarr(int a[]) {
		int n = a.length;
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			currSum += a[i];
			if(maxSum < currSum) maxSum = currSum;
			if(currSum < 0) currSum = 0;
		}
		return maxSum;
	}

//	Minimum SUM subArray ( KADENES ALGORITHM )
//	6 -7 4 -2 1 5 -4
//	================================================================================================
	static int minSumSubarr(int a[]) {
		int n = a.length;
		int currSum = 0;
		int minSum = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			if(currSum > 0) {
				currSum = a[i];
			} else {
				currSum += a[i];
			}
			minSum = Math.min(minSum, currSum);
		}
		return minSum;
	}
	
//	Container with most water ( TWO POINTERS APPROACH )
//	1 8 6 2 5 4 8 3 7
//	=================================================================================================
	static int containWithMostWater(int a[]){
		int maxArea = 0;
		int l = 0;
		int r = a.length - 1;
		
		while(l < r) {
			int height = Math.min(a[l], a[r]);
			int distance = r-l;
			
			int area = height * distance;
			maxArea = Math.max(maxArea, area);
			
			if(a[l] < a[r]) {
				l++;
			} else {
				r--;
			}
		}
		
		return maxArea;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {2,7,6,1,4,3};
//		leadersArray(arr);
		
//		int arr[] = {6,-7,4,-2,1,5,-4};
//		System.out.print(maxSumSubarr(arr));
		
//		int arr[] = {1,4,6,2,5,4,8,3,7};
//		System.out.print(containWithMostWater(arr));
		
//		int arr[] = {3, -4, 2, -3, -1, 7, -5};
//		System.out.print(minSumSubarr(arr));
		
	}

}
