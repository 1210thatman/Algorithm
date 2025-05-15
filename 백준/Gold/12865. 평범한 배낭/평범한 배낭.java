import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //입력되는 물품의 수
        int maxK = sc.nextInt(); //준서가 버틸 수 있는 무게

        int[][] dp = new int[n+1][maxK+1];
        int[] k = new int[n+1];
        int[] v = new int[n+1];

        for(int i=1; i<=n; i++){
            k[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=maxK; j++){
                dp[i][j] = dp[i-1][j]; //이전 행 결과 복사
                if(j - k[i] >= 0){
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-k[i]]+v[i]);
                    //더 큰 값으로 갱신
                }
            }
        }
        System.out.println(dp[n][maxK]);
    }
}
