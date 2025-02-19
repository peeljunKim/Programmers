import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int temp = 1;
        
        
        while(temp < arr.length){
            temp *=2;
        }
        
        return Arrays.copyOf(arr, temp);
    }
}