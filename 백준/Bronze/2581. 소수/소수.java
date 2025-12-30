import java.util.*;

public class Main {

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean isMatch = false;

        for (int x = M; x <= N; x++) {
            if (isPrime(x)) {
                sum += x;
                if (x < min) min = x;
                isMatch = true;
            }
        }

        if (!isMatch) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

        sc.close();
    }
}
