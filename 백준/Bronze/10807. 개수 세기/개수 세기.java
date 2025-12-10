import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 정수의 개수
        int[] arr = new int[num];  

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int findNum = sc.nextInt();  // 찾으려는 정수
        int count = 0; 

        for (int i = 0; i < num; i++) {
            if (arr[i] == findNum) {
                count++;
            }
        }

        System.out.println(count);
    }
}