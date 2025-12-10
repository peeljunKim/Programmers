import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt(); 
        int value = sc.nextInt(); // 기준 값 X

        StringBuilder sb = new StringBuilder(); 

        for (int i = 0; i < len; i++) {
            int num = sc.nextInt(); 

            if (num < value) {
                sb.append(num).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
