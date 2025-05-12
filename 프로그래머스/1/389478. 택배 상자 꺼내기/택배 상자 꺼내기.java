import java.util.*;
class Solution {
    /**
    @param w 가로로 택배 상자 놓는 갯수
    @param n 택배의 갯수
    @param num 꺼내야 되는 택배 숫자
    **/
    public int solution(int n, int w, int num) {
        int answer = 0;
        int col = w; // 세로
        int row = 0; // 가로
        int x = 0; // 꺼내야 되는 택배에 가로 좌표
        int y = 0; // 꺼내야 되는 택베에 세로 좌표
        
        if(n % w == 0){
            row = n/w;
        }else{
            row = n/w + 1;
        }
         
        int[][] boxs = new int [row][col];
        int cnt = 1;
        
        // 박스 위치 배열 만들기
        for (int i = 0; i < row; i++) {
            int start = (i % 2 == 0) ? 0 : col - 1;
            int end = (i % 2 == 0) ? col : -1;
            int step = (i % 2 == 0) ? 1 : -1;

            for (int j = start; j != end; j += step) {
                boxs[i][j] = cnt;

                if (cnt == num) {
                    x = i;
                    y = j;
                }
                if (cnt == n) {
                    break;
                }
                cnt++;
            }
        }
        
        System.out.println(Arrays.deepToString(boxs));
        // System.out.println("x = " + x + ", y = " + y);
        // 꺼내야 되는 택배 개수 확인
        for(int i=x; i<row; i++){
            if(boxs[i][y] != 0){
                answer++;
            }
        }
        
        return answer;
    }
}