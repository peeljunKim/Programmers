import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;

            List<Integer> arr = new ArrayList<>();
            int sum = 0;

            // 자기 자신(n)을 제외한 약수 찾기 (1 ~ n/2)
            for (int d = 1; d <= n / 2; d++) {
                if (n % d == 0) {
                    arr.add(d);
                    sum += d;
                }
            }

            if (sum == n) {
                sb.append(n).append(" = ");
                for (int i = 0; i < arr.size(); i++) {
                    sb.append(arr.get(i));
                    if (i < arr.size() - 1) sb.append(" + ");
                }
                sb.append('\n');
            } else {
                sb.append(n).append(" is NOT perfect.").append('\n');
            }
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
