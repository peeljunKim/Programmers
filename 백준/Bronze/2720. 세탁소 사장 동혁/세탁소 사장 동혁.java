import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt(); 
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < time; i++) {
            int num = sc.nextInt(); // 거스름돈

            int quarters = num / 25;
            num %= 25;

            int dimes = num / 10;
            num %= 10;

            int nickels = num / 5;
            num %= 5;

            int pennies = num; // 남는 돈(센트)

            sb.append(quarters).append(" ")
              .append(dimes).append(" ")
              .append(nickels).append(" ")
              .append(pennies).append('\n');
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
