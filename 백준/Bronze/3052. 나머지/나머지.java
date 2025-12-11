import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] arr = new boolean[42]; // 0 ~ 41

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();     // 입력 숫자
            int r = num % 42;          // 42로 나눈 나머지
            arr[r] = true;            
        }

        int count = 0; 

        for (int i = 0; i < 42; i++) {
            if (arr[i]) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
