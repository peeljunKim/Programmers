import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
            if (map.get(player) == 0) {
                map.remove(player);
            }
        }
        answer = map.keySet().iterator().next();
    
        return answer;
    }
}
// participant 참가자
// completion 완주자
// 참가자 중에는 동명이인이 있을 수도
// 참가자 배열 arraylist로 복사해서 지우면 될 듯?
// 효율성 테스트 실패