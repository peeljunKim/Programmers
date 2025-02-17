import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        int start = 0;
        int end = 0;
        
        
        
        for(int i=0; i < arr.length; i++){
            if (arr[i] == 2){
                start = i;
                break;
            }
            
        }
        
        for(int j=arr.length-1; j>=0; j--){
            if (arr[j]==2){
                end = j;
                break;
            }
        }
        
        if(start == 0 && end ==0){
            return new int[] {-1};
        }
        
        int[] answer = Arrays.copyOfRange(arr, start, end + 1);
        
        return answer;
    }
}
// 입출력 예 2번 사례를 고려하지 못함 
// 그렇게 되면 start는 0이 아니게 되고
// Arrays.copyOfRange(arr, statr, 1)이 작동해서 오류 발생함