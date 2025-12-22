import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;      
        int maxRow = 1;    
        int maxCol = 1;    

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int val = sc.nextInt(); // 81개 숫자

                if (val > max) {
                    max = val;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);

        sc.close();
    }
}
