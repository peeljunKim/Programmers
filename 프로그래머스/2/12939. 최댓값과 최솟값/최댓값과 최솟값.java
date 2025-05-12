import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String [] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            int num = Integer.parseInt(arr[i]); // 비교할 숫자
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }
        answer = min + " " +max;
        
        return answer;
    }
}