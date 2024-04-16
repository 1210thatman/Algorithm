import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int star = input.nextInt();
        for(int i=0; i<star; i++){
            for(int j=star-1; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}