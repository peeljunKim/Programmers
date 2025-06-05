import java.util.*;
class Solution {
    /*
    @param weights 사람들에 몸무게 배열
    return 시소 짝꿍 개수
    */
    public long solution(int[] weights) {
        long answer = 0;
        long [] types = {2L, 3L, 4L};
        Map<Integer, Long> map = new HashMap<>();
        for(int weight : weights){
            map.put(weight, map.getOrDefault(weight, 0L) + 1);
        }
        
        for(int weight : map.keySet()){
            long cnt = map.get(weight);
            // 몸무게가 같은 경우
            answer += cnt * (cnt - 1L) / 2;
            
            // 2:4인 경우 두배인 경우
            int doubleWeight = weight*2;
            if(map.containsKey(doubleWeight)){
                answer += (cnt * map.get(doubleWeight));
            }
            // 2:3인 경우
            if(weight * 3 % 2 == 0){ 
                int weight2 = weight * 3 / 2;
                // System.out.println(weight2);
                if(map.containsKey(weight2)){
                    answer += (cnt * map.get(weight2));
                }
            }
            
            // 3:4인 경우 
            if(weight * 4 % 3 == 0){ // 해당 조건절을 안하면 뒤에 소수점이 짤려서 그걸 방지하기 위한 조건절
                int weight3 = weight * 4 / 3; // 소수점이 짤림 
                // System.out.println(weight3);
                if(map.containsKey(weight3)){
                    answer += (cnt * map.get(weight3));
                }
            }
            
        }
        
        return answer;
    }
}

/*
2:3
w1 * 2 == w2 * 3 (만족하려면 w1 > w2)
w1? == w2 * 3 / 2

2:4
w1 * 2 == w2 * 4 (w1 > w2)
w1 = w2 * 2

3:4
w1 * 3 == w2 * 4 (w1 > w2)
w1? == w2 * 4 / 3;
*/