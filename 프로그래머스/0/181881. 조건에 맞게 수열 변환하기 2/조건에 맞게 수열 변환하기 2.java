import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] beforeArr = Arrays.copyOf(arr, arr.length);
        
        while(true){
            answer++;
           
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                   
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                   
                }
            }
            
            if (Arrays.equals(arr, beforeArr)) {
                break; 
            }
            
            beforeArr = Arrays.copyOf(arr, arr.length);
        }
        
        return answer-1;
    }
}


/*
arr[?] >= 50 && 짝수면
/2

arr[?] < 50 && 홀수면
arr[?] * 2 + 1
*/