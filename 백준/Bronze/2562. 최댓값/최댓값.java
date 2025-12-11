import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;      
        int idx = 0;     

        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt();  

            if (num > max) {
                max = num; 
                idx = i;   
            }
        }

        System.out.println(max);
        System.out.println(idx);

        // 사용한 리소스 정리
        sc.close();
    }
}