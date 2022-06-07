public class Magic {
    private static void main(Strings args[]) {

    }

    static int MagicNumber(int N) {
        // Enter your code here
        int i = 0;
        while (checkNotMagic(N - i) == true && checkNotMagic(N + i) == true) {
            i++;
        }

        if (checkNotMagic(N - i) == false) {
            return N - i;
        } else {
            return N + i;
        }

    }

    static boolean checkNotMagic(int n) {

        boolean seven = false;

        boolean nine = false;

        while (n > 0) {
            if (n % 10 == 7) {
                seven = true;
            }
            if (n % 10 == 9) {
                nine = true;
            }
            n = n / 10;
        }

        if (seven && nine) {
            return false;
        } else {
            return true;
        }
    }
}
