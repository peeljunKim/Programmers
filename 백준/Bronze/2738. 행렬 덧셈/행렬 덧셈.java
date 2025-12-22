import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 행
        int M = sc.nextInt(); // 열
        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int b = sc.nextInt();
                int sum = arr[i][j] + b;

                sb.append(sum);
                if (j < M - 1) sb.append(" ");
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
