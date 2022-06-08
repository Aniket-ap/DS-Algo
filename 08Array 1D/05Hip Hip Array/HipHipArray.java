public class HipHipArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] temp = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int tempVar = num;
        for (int j = 0; j < num; j++) {
            temp[tempVar - 1] = arr[j];
            tempVar -= 1;
        }

        int sum = 0;
        int product = 1;

        for (int k = 0; k < num; k++) {
            if (k % 2 == 0) {
                product *= temp[k];
            } else {
                sum += temp[k];
            }
        }

        System.out.println(sum + " " + product);
    }
}
