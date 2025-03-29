import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] words = {"zero", "one", "two", "three", 
                          "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        while(idx < s.length()){
            if(Character.isDigit(s.charAt(idx))){
                sb.append(s.charAt(idx));
                idx++;
            }else{
                for(int i=0; i<words.length; i++){
                    String str = words[i];
                    if(s.startsWith(str, idx)){
                        // sb.append(str); // 인덱스를 숫자로 생각하면 됨
                        sb.append(i);
                        idx += str.length();
                        // System.out.println("str = " + str);
                        break;
                    }
                }
            }
            // break;
        }
        // System.out.println(sb);
        answer = Integer.parseInt(sb.toString());
        
        return answer;
    }
}
// zero이나 0으로 시작 x