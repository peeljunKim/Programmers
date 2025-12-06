import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int thrid = sc.nextInt();
        
        int result = 0;
        
        if (first == second && second == thrid) {
            result = 10000 + (first * 1000);
        } else if (first == second || first == thrid) {
            result = 1000 + (first * 100);
        } else if (second == thrid) {
            result = 1000 + (second * 100);
        } else {
            int max = Math.max(first, Math.max(second, thrid)); 
            result = max * 100;
        }

        System.out.println(result);
    }
}