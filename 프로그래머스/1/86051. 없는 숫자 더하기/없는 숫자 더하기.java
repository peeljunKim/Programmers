import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        
        for(int temp : numbers){
            sum += temp;
        }
        answer = 45 - sum;
        
        return answer;
    }
}

// 0~ 9 더하면 45 
// numbers총합을 45에서 빼면 되는건가??