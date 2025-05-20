import java.util.*;
class Solution {
    // @param 코니가 가진 의상들의 2차 배열
    public int solution(String[][] clothes) {
        int answer = 1; // 곱해야 되어서 초기값 1로 지정 
        Map<String, Integer> map = new HashMap<>(); // key 옷 종류, value 옷 개수
        
        
        for(int i=0; i<clothes.length; i++){
            String clotheseName = clothes[i][0]; // 옷 이름
            String type = clothes[i][1]; // 옷 종류
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        for(int cnt : map.values()){
            answer *= (cnt + 1);
        }
        
        // 전체 경우의 수 - 옷을 안 입는 경우
        answer -= 1;
        
        // System.out.println(map);
        
        
        return answer;
    }
}

// 매일 다른 옷을 조합

// 기본적으로 하나씩 입는 경우의 수
// 다른 종류의 옷을 2~4개 입는 경우
// 전체 경우의 수 - 옷을 못 입는 경우 ? 1 ?