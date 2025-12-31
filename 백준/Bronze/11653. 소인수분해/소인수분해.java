import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        if (N == 1) {
            sc.close();
            return;
        }

        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                sb.append(i).append('\n');
                N /= i;
            }
        }

        // 남은 N이 1보다 크면 그것도 소인수(마지막 소수)
        if (N > 1) {
            sb.append(N).append('\n');
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
