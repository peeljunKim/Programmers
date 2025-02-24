import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int row = num_list.length/n; // 행
        int col = n; // 열
        int idx = 0;
        int[][] answer = new int [row][col];
        
        for(int i=0; i< row; i++){
            for(int j=0; j<col; j++){
                answer[i][j] = num_list[idx++];
            }
        }
        
        return answer;
    }
}