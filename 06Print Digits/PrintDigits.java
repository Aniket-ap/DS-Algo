public class PrintDigits {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Print_Digits(num);

    }

    static void Print_Digits(int N) {
        // Enter your code here
        String s = Integer.toString(N);

        for (int i = 0; i < s.length(); i++) {
            printValue(s.charAt(i));
        }
    }

    static void printValue(char n) {
        switch (n) {
            case '1':
                System.out.print("one ");
                break;
            case '2':
                System.out.print("two ");
                break;
            case '3':
                System.out.print("three ");
                break;
            case '4':
                System.out.print("four ");
                break;
            case '5':
                System.out.print("five ");
                break;
            case '6':
                System.out.print("six ");
                break;
            case '7':
                System.out.print("seven ");
                break;
            case '8':
                System.out.print("eight ");
                break;
            case '9':
                System.out.print("nine ");
                break;
            case '0':
                System.out.print("zero ");
                break;
        }
    }
}
