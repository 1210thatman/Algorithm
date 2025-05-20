import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int V =  input.nextInt();

        if(V < A){
            System.out.println(1);
        }

        else{
            if((V-A)%(A-B) == 0){
                System.out.println((V-A)/(A-B)+1);
            }
            else{
                System.out.println((V-A)/(A-B)+2);
            }
        }
    }
}
