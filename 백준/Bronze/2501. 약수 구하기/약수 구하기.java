import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {   // i가 N의 약수
                count++;
                if (count == K) {
                    System.out.println(i);
                    sc.close();
                    return;
                }
            }
        }

        System.out.println(0);
        sc.close();
    }
}
