import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();   
        int kinds = sc.nextInt();     
        
        long sum = 0;             

        for (int i = 0; i < kinds; i++) {
            long a = sc.nextLong();  // 물건 가격
            long b = sc.nextLong();  // 물건 개수
            sum += a * b;            
        }

        if (sum == num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
