import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // N개의 정수
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE; 

        for (int i = 0; i < num; i++) {
            int value = sc.nextInt();

            if (value < min) {
                min = value;   
            }
            if (value > max) {
                max = value;   
            }
        }

        System.out.println(min + " " + max);

    }
}