import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(make1(x));
    }

    public static int make1(int n){
        int[] dp = new int[n+1];

        for(int i=2;i<=n;i++){
            dp[i] = dp[i - 1] + 1;

            if(i % 2 == 0){
                dp[i] = min(dp[i],  dp[i/2]+1);
            }

            if(i % 3 == 0){
                dp[i] = min(dp[i], dp[i/3]+1);
            }
        }
        return dp[n];
    }
}
