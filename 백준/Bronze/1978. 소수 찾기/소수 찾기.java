import java.util.*;

public class Main {

    // 소수 판별 함수
    private static boolean isPrime(int n) {
        if (n < 2) return false;  // 0, 1 
        if (n == 2) return true; // 2는 소수
        if (n % 2 == 0) return false;  // 2를 제외한 짝수는 소수 아님

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 개수 N
        int result = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt(); // N개의 수가 주어지는데 수
            if (isPrime(num)) result++;
        }

        System.out.println(result);
        sc.close();
    }
}
