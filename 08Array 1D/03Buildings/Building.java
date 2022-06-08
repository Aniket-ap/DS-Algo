public class Building {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        int totalNum = 1;

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < num; i++) {
            if (max < arr[i]) {
                ++totalNum;
                max = arr[i];
            }
        }

        System.out.println(totalNum);
    }
}
