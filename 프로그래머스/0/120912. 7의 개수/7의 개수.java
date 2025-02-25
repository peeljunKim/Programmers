import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);
        for(int i=0; i<str.length(); i++){
            if('7'==str.charAt(i)){
                answer++;
            }
            
        }
        

        return answer;
    }
}

// for문 안에 for문으로 하면 쉬움
