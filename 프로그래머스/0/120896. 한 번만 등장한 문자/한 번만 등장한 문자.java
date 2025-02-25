import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String notSortAnswer = "";
        
        for(int i=0; i<s.length(); i++){
            int cnt = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    cnt++;
                }
            }
            if(cnt==1){
                notSortAnswer += s.charAt(i);
            }
        }
        
        char[] c =notSortAnswer.toCharArray();
        Arrays.sort(c);
        answer = new String(c);
        
        return answer;
    }
}
// map으로 (사용한 횟수, 알파벳) or (알파벳, 사용한 횟수)??
// 정수형 자료형 선언하고 
// for문 for문으로 해결