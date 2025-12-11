import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 바구니 개수, M: 공을 넣는 횟수
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N + 1];  

        for (int a = 0; a < M; a++) {
            int i = sc.nextInt(); // 시작 바구니 번호
            int j = sc.nextInt(); // 끝 바구니 번호
            int k = sc.nextInt(); // 넣을 공 번호

            for (int idx = i; idx <= j; idx++) {
                basket[idx] = k; 
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int idx = 1; idx <= N; idx++) {
            sb.append(basket[idx]);
            if (idx < N) {
                sb.append(" "); 
            }
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
