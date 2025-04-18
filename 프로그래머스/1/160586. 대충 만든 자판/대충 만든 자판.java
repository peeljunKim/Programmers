import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> pressCnt = new HashMap<>();
        
        for (int i = 0; i < keymap.length; i++) {
            String keys = keymap[i];
            for (int j = 0; j < keys.length(); j++) {
                char c = keys.charAt(j);
                // 현재 문자에 대해 최소 누름 횟수 업데이트
                pressCnt.put(c, Math.min(
                    pressCnt.getOrDefault(
                        c, Integer.MAX_VALUE), j + 1));
            }
        }
        
        int[] answer = new int[targets.length];
        
        // 각 타겟 문자열에 대해 키 누름 횟수 계산
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int total = 0;
            boolean isType = true;
            
            for (char c : target.toCharArray()) {
                if (pressCnt.containsKey(c)) {
                    total += pressCnt.get(c);
                } else {
                    isType = false;
                    break;
                }
            }
            
            // 결과 저장
            answer[i] = isType ? total : -1;
        }
        
        return answer;
    }
}