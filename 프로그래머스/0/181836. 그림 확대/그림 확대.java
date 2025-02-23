import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String [picture.length * k];
        int idx = 0;
        
        for(int i=0; i<picture.length; i++){
            String str = "";
            for(int j=0; j<picture[i].length(); j++){
                for(int z=0; z<k; z++){
                    str += picture[i].charAt(j);
                }
                
            }
            for(int y=0; y<k; y++){
                answer[idx] = str;
                System.out.println(str);
                idx++;
            }
            
        }
        
        return answer;
    }
}