import java.util.*;

class Solution {
    public String solution(String myString, String pat) {
//         String answer = "";
//         int leftCnt = myString.lastIndexOf(pat);
//         int rightCnt = myString.length() - pat.length() - leftCnt;
        
//         if(leftCnt > rightCnt){
//             answer = myString.substring(0, leftCnt + pat.length());
//         }else{
//             answer = myString.substring(leftCnt, myString.length() + pat.length());
//         }
        
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}