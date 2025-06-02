import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        System.out.println(width(width));

    }
    public static int width(int width){
        int[] f = new int[width+1];

        if(width == 1 || width == 2){
            return width;
        }

        f[1] = 1;
        f[2] = 2;

        for(int i = 3; i < width+1; i++){
            f[i] = (f[i-1] + f[i-2])%10007;
        }
        return f[width];
    }
}