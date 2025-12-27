import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long V = sc.nextLong();

        long daily = A - B;  // 하루 증가량
        long target = V - A;  // 마지막 목표량
        long result = 0L;
        
        if (target <= 0) {
            result = 1; 
        } else {
            result = (target + daily - 1) / daily + 1;
        }

        System.out.println(result);
        sc.close();
    }
}
