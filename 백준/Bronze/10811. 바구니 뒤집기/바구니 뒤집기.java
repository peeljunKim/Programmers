import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 수
        int M = sc.nextInt(); // x번 순서를 변경(역순)

        int[] basket = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }

        for (int t = 0; t < M; t++) {
            int i = sc.nextInt(); // 시작 바구니 번호
            int j = sc.nextInt(); // 끝 바구니 번호

            while (i < j) {
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                i++;
                j--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(basket[i]);
            if (i < N) sb.append(" ");
        }

        System.out.println(sb.toString());

        sc.close();
    }
}