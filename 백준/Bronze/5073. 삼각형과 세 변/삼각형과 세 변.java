import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 마지막 줄
            if (a == 0 && b == 0 && c == 0) break;

            int max = Math.max(a, Math.max(b, c)); // 가장 긴 변
            int sum = a + b + c;

            // 가장 긴 변 나머지 두 변의 합(sum - max) / 가장 긴 변(max)
            if (sum - max <= max) {
                sb.append("Invalid\n");
            } else if (a == b && b == c) {
                sb.append("Equilateral\n");
            } else if (a == b || b == c || a == c) {
                sb.append("Isosceles\n");
            } else {
                sb.append("Scalene\n");
            }
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
