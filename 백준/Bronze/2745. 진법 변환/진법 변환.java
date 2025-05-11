import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String n =  input.next();
        int b =  input.nextInt();

        long result = 0;

        for(int i=0; i<n.length(); i++){
            if('0' <= n.charAt(i) && n.charAt(i) <= '9'){ //한자리 뽑아냄
                result = result * b + ((int)n.charAt(i)-(int)'0');
            }
            else{
                result = result * b + ((int)n.charAt(i)-(int)'A'+10);
            }
        }
        System.out.println(result);
    }
}