import java.util.*;
class Solution {
    /**
    @param want 원하는 제품 배열
    @param number 원하는 제품 수량
    @param discount 할인하는 제품 문자열
    **/
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>(); // key 원하는 제품, value 원하는 갯수
        for(int i=0; i<want.length; i++){
            map.put(want[i], number[i]);
        }
        // System.out.println(map);
        
        // boolean isMapMatch = true;
        
        for(int i = 0; i <= discount.length - 10; i++){
            // key 10일 동안 할인 제품 value 10일간 할인되는 수량 
            boolean isMapMatch = true; 
            Map<String, Integer> discountMap = new HashMap<>();
            
            // 10일간 할인 품목, 수량 매핑
            for (int j = i; j < i + 10; j++) {
                String product = discount[j];
                discountMap.put(product, discountMap.getOrDefault(product, 0) + 1);
                // System.out.println("j = " +j);
                // System.out.println("discountMap = " + discountMap);
            }
           
            // 사고 싶은 제품, 수량 확인
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                // System.out.println("entry = " + entry);
                String wantProdunt = entry.getKey(); // 원하는 품목
                int wantCnt = entry.getValue(); // 원하는 수량
                
                // 사고 싶은 제품, 수량 확인 조건절
                if(!discountMap.containsKey(wantProdunt) 
                   || discountMap.get(wantProdunt) < wantCnt){
                    isMapMatch = false;
                    break;
                }
            }
            
            // 원하는 제품을 다 구매 가능할 때
            if(isMapMatch) answer++;
            
        }
        
        return answer;
    }
}


// 일정 금액 지불하면 10일 동안 회원
// 해당 마트에서는 회원 대상으로 한 가지 제품을 할인, 할인하는 제품은 하루에 하나씩 구매 가능