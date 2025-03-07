import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            for(String word : words){
                if(babbling[i].contains(word)){
                    babbling[i] = babbling[i].replace(word, "#");
                }
            }
        }
        
        for(String str : babbling){
            if(checkWord(str)){
                answer++;
            }
        }
        
        // System.out.println(Arrays.toString(babbling));
        return answer;
    }
    
     public static boolean checkWord(String str) {
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                return false; 
            }
        }
        return true; 
    }
}
//