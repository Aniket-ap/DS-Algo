import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static boolean checkPrime(long n){
		if(n <= 1){
			return false;
		}
		int sqrt = (int)Math.sqrt(n);
		for(int i = sqrt; i >= 2; i--){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main (String[] args) {
        // Your code here
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();

		if(checkPrime(num) == true){
			System.out.println(num);
		} else{
			long left = num-1;
			while(checkPrime(left) == false){
				left--;
			}

			long right = num+1;
			while(checkPrime(right) == false){
				right++;
			}
			long lefttSteps = num - left;
			long rightSteps = right - num;
			if(lefttSteps == rightSteps){
				System.out.println(left);
			} else if(lefttSteps < rightSteps){
				System.out.println(left);
			} else if(lefttSteps > rightSteps){
				System.out.println(right);
			}
		}
	}
}