import java.util.*;
class Solution {
    /*
    @param land N행 4열
    */
    int solution(int[][] land) {
        int answer = 0;
        int row = land.length; // 행
        
        for (int i = 1; i < row; i++) { // 행
            for (int j = 0; j < 4; j++) { // 열
                int max = 0;
                for (int k = 0; k < 4; k++) { 
                    if (k == j) continue; // 같은 열인 경우
                    max = Math.max(max, land[i - 1][k]); // 이전 행의 최댓값
                    // System.out.println("max = " + max);
                }
                land[i][j] += max;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, land[row - 1][i]);
        }
        
        return answer;
    }
}

// 행의 개수 N : 100,000 이하의 자연수
// 열의 개수는 4개이고, 땅(land)은 2차원 배열로 주어집니다.
// 점수 : 100 이하의 자연수
// 특이사항: 같은 열을 연속으로 밟을 수 없음