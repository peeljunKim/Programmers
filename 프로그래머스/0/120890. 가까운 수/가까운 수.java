import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int temp = 100;
        int idx = 0;
        
        Arrays.sort(array); // 가까운 수가 여러 개면 더 작은 수를 반환, 정렬을 하면 자동으로 더 작은 수 반환
        
        for(int i=0; i<array.length; i++){       
            if(temp > Math.abs(array[i] -n)){
                temp = Math.abs(array[i] -n); // 각 원소 n 뺀 값
                idx = i;
            }
        }
        
        answer=array[idx];
        
        return answer;
    }
}
// |array[?] -  n | 이 가장 작은 값이 answer