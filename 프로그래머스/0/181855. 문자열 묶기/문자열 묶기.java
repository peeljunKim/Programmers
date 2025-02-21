import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] cnt = new int[31];
        
        
        for(int i = 0; i<strArr.length; i++){
            int idx = strArr[i].length();
            cnt[idx]++;
        }
        for(int num : cnt){
            if(answer < num){
                answer = num;
            }
        }
        
        
        return answer;
    }
}