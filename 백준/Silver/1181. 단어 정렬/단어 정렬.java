import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        sc.nextLine();

        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr, (s1, s2) ->
                (s1.length() == s2.length()) ? s1.compareTo(s2) : s1.length() - s2.length()
        );

        System.out.println(arr[0]);

        for(int i=1; i<n; i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}