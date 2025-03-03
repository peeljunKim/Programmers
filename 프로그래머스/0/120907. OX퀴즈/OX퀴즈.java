import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {

        
        List<String> result = new ArrayList<>();
        
        for (String str : quiz) {
            String[] parts = str.split(" ");
            int X = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int Y = Integer.parseInt(parts[2]);
            int Z = Integer.parseInt(parts[4]);
            boolean isCorrect = false;
            
            if (operator.equals("+")) {
                isCorrect = (X + Y == Z);
            } else if (operator.equals("-")) {
                isCorrect = (X - Y == Z);
            }
            
            if (isCorrect) {
                result.add("O");
            } else {
                result.add("X");
            }
        }
        
        String[] answer = new String[result.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=result.get(i);
        }
        
        return answer;
    }
}