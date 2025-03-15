import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        char[] numbers = str.toCharArray();
        Arrays.sort(numbers);
        
        StringBuffer sb = new StringBuffer(new String(numbers));
        answer = Long.parseLong(sb.reverse().toString());
        
        return answer;
    }
}