import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) break;

            // 약수 확인
            if (b % a == 0) {
                sb.append("factor\n");
            }  else if (a % b == 0) { // 배수 확인            
                sb.append("multiple\n");
            }  else {
                sb.append("neither\n");
            }
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
