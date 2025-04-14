import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        for (int i = 0; i < n; i++) {
            String brackets = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for (int j = 0; j < brackets.length(); j++) {
                char c = brackets.charAt(j);

                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                isVPS = false;
            }

            System.out.println(isVPS ? "YES" : "NO");
        }

        sc.close();
    }
}