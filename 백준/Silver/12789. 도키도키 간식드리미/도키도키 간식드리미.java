import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int index = 1;
        String result = "Nice";

        for (int i = 0; i < N; i++) {
            int currentNum = Integer.parseInt(st.nextToken());

            if (index != currentNum) {
                while (!stack.isEmpty() && index == stack.peek()) {
                    stack.pop();
                    index++;
                }
                stack.push(currentNum);
            } else {
                index++;
            }
        }

        while (!stack.isEmpty()) {
            if (stack.pop() == index) {
                index++;
            } else {
                result = "Sad";
                break;
            }
        }

        System.out.println(result);
    }
}
