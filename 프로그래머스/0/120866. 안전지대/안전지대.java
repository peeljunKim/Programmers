import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0; // 안전한 갯수
        int length = board.length;
        boolean [][] bools = new boolean[length][length]; // 기본값 false
        // int dangerZone = 0;
      
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 1){
                    for(int x= -1; x<=1; x++){
                        for(int y=-1; y<=1; y++){
                            int dangerZone_x = i+x;
                            int dangerZone_y = j+y;
                            // System.out.print("x="+dangerZone_x+" y="+dangerZone_y+",");
                            if(dangerZone_x >= 0 && dangerZone_x < length &&
                              dangerZone_y >= 0 && dangerZone_y < length){
                                // System.out.print("x="+dangerZone_x+" y="+dangerZone_y+",");
                                // dangerZone++;
                                bools[dangerZone_x][dangerZone_y] = true;
                            }

                        }
                    }
                }
            }
        }

        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                if(!bools[i][j]){
                    answer++;
                }
            }
        }
        // System.out.print(Arrays.deepToString(bools));
        
        return answer;
    }
}