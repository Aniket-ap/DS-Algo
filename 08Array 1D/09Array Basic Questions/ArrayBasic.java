public class ArrayBasic {
    public static void main(String[] args) {
       
        // Search an element
        int[] arr = {1,4,2,6,8};
		int key = 8;
		int res = -1;
		for(int i= 0; i < arr.length; i++) {
			if(arr[i] == key) {
				res = i;
				break;
			}
		}
		if(res == -1) {
			System.out.println("Element Not Found !!!");
		} else {
			System.out.println("Key Present at index " + res);
		}
        
    }
}
