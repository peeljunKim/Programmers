import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        String[] arr = myStr.split("[abc]");
        List<String> list = new ArrayList<>();
        
        for(String str : arr){
            if(!str.isEmpty()){
                list.add(str);
            }
        }
        
        if(list.isEmpty()){
            list.add("EMPTY");
        }
        
        String[] answer = new String [list.size()];
        
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}