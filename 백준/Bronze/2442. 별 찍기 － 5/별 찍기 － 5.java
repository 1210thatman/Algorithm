import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int star = input.nextInt();
        int num = 1;
        for(int i=0; i<star; i++){
            for(int j=star-1; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<num; k++){
                System.out.print("*");
            }
            num = num + 2;
            System.out.println();
        }
    }
}