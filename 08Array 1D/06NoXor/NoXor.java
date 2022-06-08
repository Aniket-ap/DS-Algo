public class NoXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num + 1];

        long sum = 0;

        for (int i = 1; i < num + 1; i++) {
            arr[i] = sc.nextInt();

            int xorVal = ((num - i) ^ arr[i]);
            sum += xorVal;

        }

        System.out.println(sum);
    }
}
