import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = Integer.parseInt(to3(n), 3);
        return answer;
    }
    
    public static String to3(int num){
        if(num == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        
        while(num > 0){
            int temp = num % 3;
            // System.out.println("temp = " + temp);
            sb.insert(0, temp);
            // System.out.println(sb.toString());
            num /= 3;
        }
        
        return sb.reverse().toString();
        
    }
}