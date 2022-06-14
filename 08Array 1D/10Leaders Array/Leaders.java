class Leaders {
    public static void leadersArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 6, 1, 4, 3 };
        leadersArray(arr);

    }
}