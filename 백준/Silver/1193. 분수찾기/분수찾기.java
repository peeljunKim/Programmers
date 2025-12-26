import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); 

        int n = 1; // 대각선 번호      
        long sum = 1;         

        // 대각선 찾기
        while (sum < X) {
            n++;
            sum += n;
        }

        long prevSum = sum - n;  // 대각선 누적
        int pos = (int)(X - prevSum);  // n번째 대각선의 x번째

        int numerator, denominator;

        if (n % 2 == 1) {
            numerator = n - pos + 1;
            denominator = pos;
        } else {
            numerator = pos;
            denominator = n - pos + 1;
        }

        System.out.println(numerator + "/" + denominator);

        sc.close();
    }
}
