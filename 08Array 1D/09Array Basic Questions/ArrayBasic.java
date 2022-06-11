import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // Search an element
        int[] arr = { 1, 4, 2, 6, 8 };
        int key = 8;

        // searchArr(arr, key);
        // delete(arr, key);
        // int max = largestElement(arr);
        // System.out.println(max);
        // int secondLarge = secondLargest(arr);
        // System.out.println(arr[secondLarge]);
        // int small = findSmallest(arr);
        // System.out.println(small);

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

    // Largest Element
    static int largestElement(int[] a) {
        int i = 0;
        int max = -1;

        for (; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // Second largest Element in an array
    static int secondLargest(int[] a) {
        if (a.length < 2)
            return -1;

        int largest = 0;
        int secondLargest = -1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (a[i] < a[largest]) {
                if (secondLargest == -1 || a[i] > a[secondLargest]) {
                    secondLargest = i;
                }
            }
        }

        return secondLargest;
    }

    // Remove duplicate from a sorted array

    // Smalest element in given array

    public static int findSmallest(int a[]) {
        int small = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < small) {
                small = a[i];
            }
        }

        return small;
    }

    // Third largest element in an array

    // check if the array is sorted
    public static boolean arrIsSorted(int a[]) {
        boolean isSorted = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i + 1]) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }

    // reverse the given array

    // replace every element with the gretest element on its right side
    // 7 5 8 9 6 8 5 7 4 6
    // 9 9 9 8 8 7 7 6 6 0

}
