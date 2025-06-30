import java.util.*;
class Solution {
    // key 메뉴 조합, value 주문 횟수
    private Map<String, Integer> map = new HashMap<>();
    
    /*
    @param orders 각 손님들이 주문한 단품메뉴들의 문자열 배열
    @param courese 추가하고 싶어하는 단품메뉴들의 갯수 배열
    */
    public String[] solution(String[] orders, int[] course) {
        for (String order : orders) {
            char[] orderChars = order.toCharArray();
            Arrays.sort(orderChars);
            
            dfs(orderChars, 0, new StringBuilder());
        }

        List<String> result = new ArrayList<>(); // 가장 많이 주문된 조합
        
        for (int courseLength : course) {
            int maxCount = 0; // 해당 코스 길이에서 가장 많이 주문된 횟수

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String combination = entry.getKey();
                int count = entry.getValue();

                // 조합의 길이가 현재 코스 길이와 같고 최소 2명 이상이 주문한 경우
                if (combination.length() == courseLength && count >= 2) {
                    maxCount = Math.max(maxCount, count);
                }
            }

            // 빈도수가 2 이상인 경우
            if (maxCount >= 2) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    String combination = entry.getKey();
                    int count = entry.getValue();

                    // 조합의 길이가 현재 코스 길이와 같고, 최대 빈도수와 동일한 경우
                    if (combination.length() == courseLength && count == maxCount) {
                        result.add(combination);
                    }
                }
            }
        }

        Collections.sort(result);
        String [] answer = new String [result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
    
       private void dfs(
        char[] orderChars, int startIdx, 
        StringBuilder sb) {
           
        // 현재 조합의 길이가 2 이상(메뉴)
        if (sb.length() >= 2) {
            String combo = sb.toString();
            map.put(combo, map.getOrDefault(combo, 0) + 1);
        }

        // 재귀 종료
        // 더 이상 추가할 메뉴가 없거나 남은 메뉴로도 최소 길이를 만들 수 없을 
        if (startIdx >= orderChars.length) {
            return;
        }

        for (int i = startIdx; i < orderChars.length; i++) {
            sb.append(orderChars[i]); 
            dfs(orderChars, i + 1, sb); 
            sb.deleteCharAt(sb.length() - 1); 
        }
    }
    
}
// 이전에 주문할 때 가장 많이 함께 주문한 단품 메뉴들
// 코스요리 메뉴는 최소 2가지 이상 단품메뉴로 구성
// 최소 2명 이상의 손님으로부터 주문된 단품 메노 조합으로