import java.util.*;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int [n][n];
        int num = 1;
        int top = 0;
        int bottom = n - 1; 
        int left = 0; 
        int right = n - 1;
        // if n=4

        while (num <= n * n) {

            // 맨윗줄
            for (int i = left; i <= right; i++) {
                answer[top][i] = num++;
            }
            top++;

            // 맨오른줄
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = num++;
            }
            right--;

            // 제일 아랫줄 
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    answer[bottom][i] = num++;
                }
                bottom--;
            }

            // 그 외 나머지
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    answer[i][left] = num++;
                }
                left++;
            }
        }
        
        return answer;
    }
}