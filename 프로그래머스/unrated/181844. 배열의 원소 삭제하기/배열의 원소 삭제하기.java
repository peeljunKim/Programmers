import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int size = arr.length;
        boolean[] isDeleted = new boolean[size];
        int resultSize = size;
        for(int num : delete_list){
            for(int i = 0 ; i < size ; i++){
                if(arr[i] == num){
                    isDeleted[i] = true;
                    resultSize--;
                    break;
                    
                }
            }
        }
        int[] answer = new int[resultSize];
        int index = 0;
        for(int i = 0 ; i < size ; i++){
            if(!isDeleted[i]){
                answer[index++] = arr[i];
            }
        }
        
        return answer;

    }
}