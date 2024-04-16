import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int star = input.nextInt();
        for(int i=0; i<star; i++){
            for(int j=star; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}