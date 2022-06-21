package arrays;

public class Arrays4 {

//	Trapping Rain water O(1) complexity
//	===============================================================================
	public static int trapRainWater(int a[]) {
		int ans = 0;
		int leftMax = 0, rightMax = 0;
		int l = 0, r = a.length - 1;
		
		while(l < r) {
			if(a[l] <= a[r]) {
				if(a[l] > leftMax) leftMax = a[l];
				else ans += (leftMax - a[l]);
				l++;
			} else {
				if(a[r] > rightMax) rightMax = a[r];
				else ans += (rightMax - a[r]);
				r--;
			}
		}
		
		return ans;
	}
	
	
	
//	Given an array[], find the meaximum j - i such that arr[j] > arr[i]
//	===============================================================================
//	a[] = {3,4,5,1,7,2,6,5,4,1};   ans = 3                4 (j - i == )
	static int maxValueOfJMinusI(int a[]) {
		int n = a.length;
		int rightMax[] = new int[n];
		int leftMin[] = new int[n];
		
		rightMax[n-1] = a[n-1];
		for(int i = n-2;i>=0;i--) {
			rightMax[i] = Math.max(rightMax[i+1], a[i]);
		}
		leftMin[0] = a[0];
		for(int i = n;i<n;i++) {
			leftMin[i] = Math.min(leftMin[i-1], a[i]);
		}
		
		int i = 0, j = 0;
		int ans = 0;
		while(i < n && j < n) {
			if(leftMin[i] < rightMax[j]) {
				ans = Math.max(ans, j-i);
				j++;
			} else {
				i++;
			}
		}
		return ans;
	}
	
	
//	Find two numbers in a sorted array  with given sum
//	int a[] = {1,2,7,8,10,12};  sum = 10;
//	===============================================================================
	static boolean twoSum(int a[], int sum) {
		int l = 0;
		int r = a.length - 1;
		
		while(l < r) {
			int currSum = a[l] + a[r];
			if(currSum > sum) {
				r--;
			} else if(currSum < sum) {
				l++;
			} else {
				return true;
			}
		}
		return false;
	}
	
	
//	Find Three numbers in an un	sorted array  with given sum
//	int a[] = {1,2,4,7,3,5,-2,1};  sum = 9;
// ================================================================================
//	static int threeSum(int a[], int sum) {
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,5,1,4,2,6};
		
//		System.out.print(trapRainWater(a));
		
//		System.out.print(maxValueOfJMinusI(a));
		
//		int arr [] = {1,2,7,8,10,12};
//		System.out.print(twoSum(arr, 10));
		
	}

}
