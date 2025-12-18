/**
체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성

입력
킹, 퀸, 룩, 비숍, 나이트, 폰의 개수 (0 <= 10)

**/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] correct = {1, 1, 2, 2, 2, 8}; // 기준이 되는 체스 말
        int[] found = new int[6]; // 입력 받은 체스 말
        
        for (int i = 0; i < 6; i++) {
            found[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(correct[i] - found[i]);
            if (i < 5) sb.append(" ");
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
