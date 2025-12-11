import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 바구니 개수, M: 공을 바꾸는 횟수
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N + 1];

        // 초기 값 할당
        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }

        for (int a = 0; a < M; a++) {
            int i = sc.nextInt();  // 교환할 첫 번째 바구니 번호
            int j = sc.nextInt();  // 교환할 두 번째 바구니 번호

            
            int temp = basket[i]; // 두 바구니에 들어있는 공 교환
            
            basket[i] = basket[j];
            basket[j] = temp;
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
