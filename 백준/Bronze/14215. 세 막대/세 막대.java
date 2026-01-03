import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // x < y < z
        int x = Math.min(a, Math.min(b, c));
        int z = Math.max(a, Math.max(b, c));
        
        int y = a + b + c - x - z;
        int result = 0;
        
        // 삼각형이 되는 경우
        if (x + y > z) {
            result = x + y + z;
        } else { // 삼각형이 안되는 변이 주어지면 가장 큰 변의 길이를 줄여야 됨
            result = x + y + (x + y - 1);
        }

        System.out.println(result);
        sc.close();

    }
}