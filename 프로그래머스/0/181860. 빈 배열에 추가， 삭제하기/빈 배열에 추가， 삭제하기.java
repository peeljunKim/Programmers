import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {

        ArrayList<Integer> x = new ArrayList<>();

        for(int i =0; i<arr.length; i++){
            
            if(flag[i] == true){
                for(int j = 0; j<arr[i]*2; j++){
                    x.add(arr[i]);
                }
                
            }else if(flag[i] == false){
                for(int k = 0; k < arr[i]; k++){
                    x.remove(x.size()-1);
                }
            }
        }
        
        int[] answer = new int [x.size()];
        for(int z=0; z<x.size(); z++){
            answer[z] = x.get(z);
        }
        
        
        return answer;
    }
}