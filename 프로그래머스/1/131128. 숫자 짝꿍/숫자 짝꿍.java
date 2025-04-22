import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        Map<Character, Integer> cntX = new HashMap<>();
        Map<Character, Integer> cntY = new HashMap<>();
        
        for (char ch : X.toCharArray()) {
            cntX.put(ch, cntX.getOrDefault(ch, 0) + 1);
        }

        for (char ch : Y.toCharArray()) {
            cntY.put(ch, cntY.getOrDefault(ch, 0) + 1);
        }
        
        Queue<Character> queue = new PriorityQueue<>((a, b) -> b - a);
        
        for (char c = '0'; c <= '9'; c++) {
            if (cntX.containsKey(c) && cntY.containsKey(c)) {
                // 공통 숫자의 개수는 두 수 중 최소 개수
                int sameCnt = Math.min(cntX.get(c), cntY.get(c));
                for (int i = 0; i < sameCnt; i++) {
                    queue.add(c);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (!queue.isEmpty()) {
            sb.append(queue.poll());
        }
        
        if (sb.length() == 0) {
            return "-1"; 
        } else if (sb.toString().matches("0+")) {
            return "0"; 
        } else{
            answer = sb.toString();
        }
        
        
        return answer;
    }
}

// 짝궁이 존재하지 않으면 짝궁은 -1, 짝꿍으로만 구성되어 있으면 0
// X, Y 상당히 큰 정수일 수 있다