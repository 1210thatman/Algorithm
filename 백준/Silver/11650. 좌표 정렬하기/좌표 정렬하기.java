import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nArr = new int[n][2];
        for(int i=0; i<n; i++) {
            nArr[i][0] = sc.nextInt();
            nArr[i][1] = sc.nextInt();
        }

        Arrays.sort(nArr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            }
            else{
                return e1[0] - e2[0];
            }
        });
        for(int i=0; i<n; i++) {
            System.out.println(nArr[i][0] + " " + nArr[i][1]);
        }
    }
}