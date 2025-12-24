import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();  // N
        int B = sc.nextInt();  // B
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int r = num % B;      
            if (r < 10) {
                sb.append((char) ('0' + r));  // 0~9
            } else {
                sb.append((char) ('A' + (r - 10)));  // 10~35(A~Z)
            }
            num /= B;
        }

        System.out.println(sb.reverse().toString());

        sc.close();
    }
}
