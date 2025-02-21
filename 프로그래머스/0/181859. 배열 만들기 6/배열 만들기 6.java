import java.util.*;
                  
class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> stk = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            int lastIdx = stk.size() - 1;
            
            if (stk.isEmpty()) {
                stk.add(arr[i]);
            } else if (stk.get(lastIdx) == arr[i]) {
                stk.remove(lastIdx);
            } else {
                stk.add(arr[i]);
            }
        }
        
        if (stk.isEmpty()) {
            return new int[]{-1};
        }
        
        int[] answer = new int [stk.size()];
        for(int i = 0; i<stk.size(); i++){
            answer[i] = stk.get(i);
        }
        

        
        
        return answer;
    }
}