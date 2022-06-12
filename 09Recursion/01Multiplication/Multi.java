public class Multi {
    public static void main(String[] args) {

    }

    static int Multiply_by_recursion(int M, int N) {
        // Enter your code here
        return product(M, N);
    }

    static int product(int x, int y) {
        if (x < y) {
            return product(y, x);
        } else if (y != 0) {
            return (x + product(x, y - 1));
        } else {
            return 0;
        }

    }
}
