import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num * num;
        }
        Double mean = (sum * 1.0) / n;
        System.out.printf("%.6f", Math.sqrt(mean));

    }
}