import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc  = new Scanner(System.in);
		int numOfTestCases = sc.nextInt();
		
		for(int i=0; i < numOfTestCases ; i++){
			int arrSize = sc.nextInt();
			int[] arr = new int[arrSize];
			for(int i1 = 0; i1 < arrSize; i1++) {
				arr[i1] = sc.nextInt();
			}
			findMax(arr, arrSize);
		}
	}
	public static void findMax(int[] arr, int size) {
		int first, second, third;
		
		first = second = third = Integer.MIN_VALUE;
		
		for(int i = 0; i < size; i++) {
			if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }

            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
 
            else if (arr[i] > third)
                third = arr[i];
			
		}
		System.out.print(first + " " + second + " " + third);
		System.out.println();
	}
}