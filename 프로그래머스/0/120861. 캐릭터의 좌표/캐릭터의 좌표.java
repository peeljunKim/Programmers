import java.util.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xMaxValue = board[0]/2;
        int yMaxValue = board[1]/2;
        
        for (String str : keyinput) {
            if (str.equals("up") && answer[1] < yMaxValue) {
                answer[1] += 1;
            } else if (str.equals("down") && answer[1] > -yMaxValue) {
                answer[1] -= 1;
            } else if (str.equals("left") && answer[0] > -xMaxValue) {
                answer[0] -= 1;
            } else if (str.equals("right") && answer[0] < xMaxValue) {
                answer[0] += 1;
            }
        }
        
        return answer;
    }
}

// y는 위 아래
// x는 왼 오