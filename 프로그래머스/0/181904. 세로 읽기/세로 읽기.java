import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++){
            if(i%m == c -1){
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}

/*
0 1 2 3 4 5 6 7 8 9
4 4 4 4 4 4 4 4 4 4
0 1 2 3 
0 1 2 3 
0 1
c= 2
*/
