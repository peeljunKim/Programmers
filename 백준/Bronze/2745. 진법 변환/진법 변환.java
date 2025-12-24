import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();   
        int B = sc.nextInt();   
        long result = 0;

        for (int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else { // 'A' ~ 'Z'
                value = ch - 'A' + 10;
            }

            result = result * B + value;
        }

        System.out.println(result);
        sc.close();
    }
}
