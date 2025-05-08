import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrSize = input.nextInt();
        int range = input.nextInt();

        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < range; i++) {
            int start = input.nextInt() - 1;
            int end = input.nextInt() - 1;

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
