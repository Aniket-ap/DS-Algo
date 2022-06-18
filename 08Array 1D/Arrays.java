package arrays;

public class Arrays1 {
	
//	Search an element
//	=============================================================================
	static int searchElement(int a[], int key) {
		int res = -1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				res = i;
				break;
			}
		}
		if(res == -1) {
			return res;
		}
		
		return res;
	}

	
//	Delete an element
//	=============================================================================
	static void delete(int a[], int key) {
		int n = a.length;
		int i = 0;
		for(; i < n; i++) {
			if(a[i] == key) {
				break;
			}
		}
		
		for(int j = i; j < n-1; j++) {
			a[j] = a[j+1];
		}
	}
	
	
//	Largest element in ana array
//	=============================================================================
	static int largestElement(int a[]) {
		int n = a.length;
		int max = 0;
		for(int i = 1; i < n;i++) {
			if(a[i] > a[max]) {
				max = i;
			}
		}
		return max;
	}
	
	
//	Second Largest
//	=============================================================================
	static int secondLargestElement(int a[]) {
		int n = a.length;
		if(a.length < 2) return -1;
		int largest = 0;
		int sLargest = -1;
		
		for(int i = 1; i < n; i++) {
			if(a[i] > a[largest]) {
				sLargest = largest;
				largest = i;
			} else if(a[i] < a[largest]) {
				if(sLargest == -1 || a[i] > a[sLargest]) {
					sLargest = i;
				}
			}
		}
		
		return sLargest;
	}

	
//	Remove duplicates from sorted array
//	=============================================================================
	static void removeDuplicate(int a[]) {
		int n = a.length;
		int j = 0;
		for(int i = 1; i < n; i++) {
			if(a[i] != a[j]) {
				a[j+1] = a[i];
				j++;
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	
//	Assignment
//	===================================================================================
	
	
//	smallest element in the given array
//	===================================================================================
	static int smallestElement(int a[]) {
		int n = a.length;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		
		return min;
	}
	
	
//	third largest element in the array
//	===================================================================================
	static int thirdLargest(int arr[]) {
		int n = arr.length;
		int first = arr[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int i = 1; i < n; i++) {
			if(arr[i] > first) {
				second = first;
				third = second;
				first = arr[i];
			} else if(arr[i] > second) {
				third = second;
				second = arr[i];
			} else if(arr[i] > third) {
				third = arr[i];
			}
		}
		
		return third;
	}
	
	
//	check if the array is sorted or not
//	===================================================================================
	static boolean isSorted(int a[]) {
		boolean isSort = true;
		int n = a.length;
		
		for(int i = 0; i < n-1; i++) {
			if(a[i] > a[i+1]) {
				return false;
			}
		}
		
		return isSort;
	}
	
	
//	reverse the given array
//	===================================================================================
	static void reverseArray(int a[]) {
		int n = a.length;
		int j = a.length - 1;
		for(int i = 0; i < n/2; i++) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	
//	replace every element with gretest element with on its right side
//	7 5 8 9 6 8 5 7 4 6
//	9 9 9 8 8 7 7 6 6 0
//	===================================================================================
	static void replaceElement(int a[]) {
		int n = a.length;
		int largest = a[n-1];
		a[n-1] = 0;
		
		for(int i = n - 1-1; i >= 0;i--) {
			if(a[i] < largest) {
				a[i] = largest;
			} else if(a[i] > largest) {
				int temp = largest;
				largest = a[i];
				a[i] = temp;
			}
		}
		
		for(int i = 0; i < n; i ++) {
			System.out.print(a[i] + " ");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {12,4,76,60,2};
		
//		Search Element
//		System.out.print(searchElement(arr,49));
		
//		delete(arr,60);
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
//		System.out.print(arr[largestElement(arr)]);
		
//		System.out.print(arr[secondLargestElement(arr)]);
		
//		int sortArray[] = {1,2,3,4,4,5,6,7,8};
//		removeDuplicate(sortArray);
		
//		System.out.print(smallestElement(arr));
		
//		System.out.print(isSorted(sortArray));
		
//		reverseArray(arr);
		
//		System.out.print(thirdLargest(arr));
		
//		int arr1[] = {7,5,8,9,6,8,5,7,4,6};
//		replaceElement(arr1);
		
	}

}
