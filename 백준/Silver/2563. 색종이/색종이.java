import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();  // 색종이 개수
        boolean[][] board = new boolean[100][100]; // 정사각형 도화지

        for (int t = 0; t < num; t++) {
            int x = sc.nextInt(); 
            int y = sc.nextInt(); 

            // 색종이 부분 색칠
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    board[i][j] = true; 
                }
            }
        }

        int result = 0;
        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (board[i][j]) result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
