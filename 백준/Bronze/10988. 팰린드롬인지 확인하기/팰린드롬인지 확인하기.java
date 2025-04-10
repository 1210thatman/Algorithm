import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int answer = 1;

        for(int i=0; i<word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                answer = 0;
            }
        }
        System.out.println(answer);
    }
}
