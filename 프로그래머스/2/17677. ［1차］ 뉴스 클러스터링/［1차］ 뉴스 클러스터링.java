import java.util.*;
class Solution {
    /*
    @param str1 입력1
    @param str2 입력2
    return 유사도 값에서 65536 곱하고 소수점 버린다
    */
    public int solution(String str1, String str2) {
        int answer = 0;
        // StringBuilder a = new StringBuilder(str1.toLowerCase());
        // StringBuilder b = new StringBuilder(str2.toLowerCase());
        // System.out.println("a = " + a +"\nb = " + b);
        
        Map<String, Integer> map1 = createHashMap(str1);
        Map<String, Integer> map2 = createHashMap(str2);
        
        // System.out.println("map1 = " + map1);
        // System.out.println("map2 = " + map2);
        int union = 0; // 합집합
        int intersection = 0; // 교집합
        
        for(String key : map1.keySet()){
            int map1Cnt = map1.get(key);
            int map2Cnt = map2.getOrDefault(key, 0);
            
            intersection += Math.min(map1Cnt, map2Cnt); // 최소값이 교집합
            union += Math.max(map1Cnt, map2Cnt); // 최대값이 합집합   
            map2.remove(key); // map2에만 존재하는 원소를 위해 map2에서 공통 원소 제거 
        }
        for(String key : map2.keySet()){
            union += map2.get(key);
        }
        
        
        
        // System.out.println("intersection = " + intersection + ", union = " + union);
        if(intersection == 0 && union == 0) return 65536;
        
        // System.out.println((double) intersection / union);
        answer = (int) Math.floor(((double) intersection / union) * 65536);
        
        return answer;
    }
    
    private Map<String, Integer> createHashMap(String str){
        Map<String, Integer> map = new HashMap<>();
        str = str.toLowerCase();
        
        for(int i=0; i<str.length()-1; i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i + 1);

            if (Character.isLetter(ch1) && Character.isLetter(ch2)) {
                String temp = (ch1+"") + (ch2+"");
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        
        return map;
    }
    
}

// "자카드 유사도"란
// A = {1,2,3} B={2,3,4} A n B = {2,3} A U B = {1, 2, 3, 4}
// A, B의 자카드 유사도는 2(교집합 개수)/4(합집합 개수)
// A, B가 모두 공집합인 경우 1로 정의
// 문자열은 두 글자씩 끊어서
// 영문자로 이루어진 쌍만 유효(공백, 숫자, 특수 문자가 들어오면 버림)
// +  예를 들어 "ab+"가 입력으로 들어오면, "ab"만 다중집합의 원소로 삼고, "b+"는 버린다.
// 대소문자 차이 무시
