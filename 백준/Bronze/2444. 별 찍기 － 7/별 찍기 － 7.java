// num 5, i = 1 2 3 4 5 / 4 3 2 1 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            for (int s = 0; s < num - i; s++) sb.append(' ');
            for (int k = 0; k < 2 * i - 1; k++) sb.append('*');
            sb.append('\n');
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int s = 0; s < num - i; s++) sb.append(' ');
            for (int k = 0; k < 2 * i - 1; k++) sb.append('*');
            sb.append('\n');
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
