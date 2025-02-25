import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        // HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<emergency.length; i++){
            int cnt =1; // 진료 순서는 1부터 시작하므로, 초기값을 1로 둠
            for(int j=0; j<emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    cnt++;
                }
            }
            
            answer[i] = cnt;
        }
        
        return answer;
    }
}
/*
1. 각 원소를 모든 원소랑 비교
2-1 비교를 해서 우선순위를 부여
2-2 우선순위는 정수형으로 ++식으로 
3. 우선순위 부여한 걸 answer에 넣으면 됨
*/