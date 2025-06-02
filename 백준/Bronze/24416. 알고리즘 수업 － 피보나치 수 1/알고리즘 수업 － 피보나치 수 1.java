import java.util.Scanner;

public class Main {
    static int f1 = 0;
    static int f2 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
        fibo2(n);
        System.out.println(f1 + " "+ f2);
    }

    public static int fibo(int n){

        if(n <= 2){
            f1++;
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static int fibo2(int n){
        int[] f = new int[n+1];
        f[1] = 1;
        f[2] = 1;

        for(int i=3; i<n+1; i++){
            f2++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
