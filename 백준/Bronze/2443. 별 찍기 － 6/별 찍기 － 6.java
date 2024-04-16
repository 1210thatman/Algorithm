import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int star = input.nextInt();
        int num = star*2-1;

        for(int i=0; i<star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = num; k > 0; k--) {
                System.out.print("*");
            }
            num = num - 2;
            System.out.println();
        }
    }
}