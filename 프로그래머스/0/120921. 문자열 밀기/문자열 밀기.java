import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int cnt = 0;
        String chage_a = A;
        
        if(A.equals(B)){
            return  0;
        }
        
        for(int i=0; i<A.length(); i++){
            cnt++;
            chage_a = moveCharToFirst(chage_a);
            if(chage_a.equals(B)){
                answer = cnt;
                break;
            }   
        }
        
        return answer;
    }
    
    public static String moveCharToFirst(String str){
        StringBuffer sb = new StringBuffer(str);
        String lastChar = sb.substring(sb.length() -1);
        String restString = sb.substring(0, sb.length()-1);
        return lastChar + restString;
    }
}