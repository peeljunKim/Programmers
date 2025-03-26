import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        int sum = 0;
        
        for(int temp : d){
            if(sum + temp <= budget){
                sum += temp;
                answer++;
            }else{
                break;
            }
        }
        
        // System.out.print(Arrays.toString(d));
        
        return answer;
    }
}
// budget = 예산
// d = 부서별 신청한 금액 배열