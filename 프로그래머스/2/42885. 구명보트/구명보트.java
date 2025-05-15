import java.util.*;
class Solution {
    /**
    @param people 구조해야 되는 사람들
    @param limit 구명보트 무게 제한
    return 최소로 필요한 구명보트 갯수
    **/
    public int solution(int[] people, int limit) {
        int answer = 0;
        int idx = 0;
        int heavyIdx = people.length -1;
        Arrays.sort(people);

        while(idx <= heavyIdx){
            answer++;
            
            // 가장 무거운 사람 + 가장 가벼운 사람 
            if(people[idx] + people[heavyIdx] <= limit){
                idx++;
            }
            heavyIdx--; // 위에 조건이 안되면 무조건 구명보트에 혼자 태워야 됨
        
        }
        
        
        return answer;
    }
}

// 구명보트 최대 두명, 무게 제한