import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] students = new int[31];
        int  n = 0;

        for(int i=1; i<students.length-2; i++){
            n = sc.nextInt();
            students[n] = 1;
        }

        for(int i=1; i<students.length; i++){
            if(students[i]!=1){
                System.out.println(i);
            }
        }
    }
}
