public class ArrayBasic {
    public static void main(String[] args) {

        // Search an element
        int[] arr = { 1, 4, 2, 6, 8 };
        int key = 8;

        searchArr(arr, key);
        delete(arr, key);

        for (int e : arr) {
            System.out.println(e + " ");
        }

    }

    // Search an element
    public static void searchArr(int arr[], int key) {
        int res = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                res = i;
                break;
            }
        }

        if (res == -1) {
            System.out.println("Element Not Found !!!");
        } else {
            System.out.println("Key Present at index " + res);
        }
    }

    // Delete an element
    public static int delete(int[] a, int key) {
        int i = 0;
        int n = a.length;
        for (; i < n; i++) {
            if (a[i] == key) {
                break;
            }
        }
        if (i == n)
            return n;
        for (int j = i; j < n - 1; j++) {
            a[j] = a[j + 1];
        }
        return n - 1;
    }
}
