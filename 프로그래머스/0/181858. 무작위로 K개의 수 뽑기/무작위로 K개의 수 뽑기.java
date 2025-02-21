import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int [k];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        
        
        while (list.size() <= k ){
            list.add(-1);
        }
        
        
        for(int j=0; j<k; j++){
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}