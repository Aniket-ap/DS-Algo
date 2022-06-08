import java.util.Scanner;

public class Donation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        int start = arr[0];

        int newArr[] = new int[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

            if (arr[i] > start) {
                newArr[i] = 0;
                start = arr[i];
            } else {
                newArr[i] = start - arr[i];
                sum += newArr[i];
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
