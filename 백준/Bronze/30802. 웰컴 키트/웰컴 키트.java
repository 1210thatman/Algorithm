import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();

        int[] shirts =  new int[6];
        for(int i=0; i<shirts.length; i++){
            shirts[i] = sc.nextInt();
        }

        int t = sc.nextInt();
        int p =  sc.nextInt();

        int count = 0;
        for (int i = 0; i < shirts.length; i++) {
            count += shirts[i] / t;
           if(shirts[i] % t != 0){
               count++;
           }
        }
        System.out.println(count);
        System.out.println(people/p + " " + people%p);
    }
}