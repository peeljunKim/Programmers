import java.util.*;
    
class Solution {
    public int solution(int a, int b, int c, int d) {
        int [] dices = {a, b, c, d};
        int answer = 0;
        Arrays.sort(dices); // 이제 dices[0]이 가장 작은 숫자, 즉 올림차순
        
        // 모든 주사위가 같은 경우, 정렬했는데 dices[0]과 dices[3]이 같으면 모든 숫자가 같음
        if (dices[0] == dices[3]) {
            answer = 1111 * dices[0];
            
        // 주사위 3개가 p로 같은 경우: (10 * p + q)제곱
        } else if (dices[0] == dices[2] || dices[1]  == dices[3]){
            // ture 위치에 a, b, c가 같은 경우
            // false 위치에 b, c, d가 같은 경우
            int p = (dices[0] == dices[2]) ? dices[0] : dices[1]; 
            int q = (dices[0] == dices[2]) ? dices[3] : dices[0];
            answer = (10 * p + q) * (10 * p + q);
        
        // 주사위가 a=b c=d인 경우, 단 a != c
        } else if (dices[0] == dices[1] && dices[2] == dices[3] ){ 
            answer = (dices[0] + dices[2]) * Math.abs(dices[0] - dices[2]);
            
        // 주사위 2개가 p로 같고 서로 다른 숫자인 경우: 서로 다른 숫자 a * b
        } else if (dices[0] == dices[1] || dices[1] == dices[2] || dices[2] == dices[3]) {
            int p = (dices[0] == dices[1]) ? dices[2] 
                : (dices[1] == dices[2]) ? dices[0] 
                : dices[1];
            
            int q = (dices[0] == dices[1]) ? dices[3] 
                : (dices[1] == dices[2]) ? dices[3] 
                : dices[0];
            
            answer = p * q;
        } else {
            answer = dices[0];    
        }
        
        

        return answer;
    }
}
// 주사위가 모두 다른 경우: 가장 작은 숫자