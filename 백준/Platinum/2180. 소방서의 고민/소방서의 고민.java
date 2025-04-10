import java.io.*;
import java.util.*;

public class Main {
    static class Task {
        int a, b;

        Task(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static boolean cmp(Task x, Task y) {
        if (x.a == 0) return false;
        else if (y.a == 0) return true;
        else if (x.b == 0 && y.b == 0) return x.a < y.a;
        return (long) x.b * y.a < (long) x.a * y.b;
    }

    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 빠른 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Task> tasks = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tasks.add(new Task(a, b));
        }

        tasks.sort((x, y) -> {
            if (cmp(x, y)) return -1;
            if (cmp(y, x)) return 1;
            return 0;
        });

        long time = 0;
        for (Task t : tasks) {
            time = time + time * t.a + t.b;
            time %= 40000;
        }

        bw.write(time + "\n");
        bw.flush();
    }
}
