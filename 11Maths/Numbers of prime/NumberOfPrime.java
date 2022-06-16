import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static boolean isPrime(long n){
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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int count = 0;
			while(n > 0){
				if(isPrime(n) == true){
					count++;
				}
				n--;
			}
			System.out.println(count);
			t--;
		}
	}

}