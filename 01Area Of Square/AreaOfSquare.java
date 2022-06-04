import java.util.*;

class Main {

    public static int areaOfSquare(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int calculatedArea = areaOfSquare(num);

        System.out.println(calculatedArea);
    }
}