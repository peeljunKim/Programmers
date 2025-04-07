import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        int temp = score.length;


        for (int i = temp - 1; i >= 0; i -= m) {
            if (i - m + 1 < 0) {
                break;
            }
            int num = score[i - m + 1];
            answer += num * m;
        }
        
        
        return answer;
    }
}