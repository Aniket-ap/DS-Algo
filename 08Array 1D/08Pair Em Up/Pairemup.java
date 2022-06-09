public class Pairemup {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int arrSize = Integer.parseInt(sc.nextLine());
        String temp[] = sc.nextLine().split(" ");
        int[] arr = new int[arrSize];
        for (int i1 = 0; i1 < arrSize; i1++) {
            arr[i1] = Integer.parseInt(temp[i1]);
        }

        // Sort array
        Arrays.sort(arr);
        int i = 0, j = arrSize - 1;
        int ans = 0;
        while (i < j) {
            int pairSum = arr[i] + arr[j];
            if (ans < pairSum) {
                ans = pairSum;
            }
            i++;
            j--;
        }
        System.out.println(ans);
    }
}
