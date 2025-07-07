import java.util.*;
class Solution {
    /*
    @param cacheSize 캐시 크기
    @param cities 도시 이름으로 이뤄진 문자열 배열
    */
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) { // 0인 경우 모두 miss
            return cities.length * 5; 
        }
        
        LinkedList<String> cache = new LinkedList<>();
        
        for(String city : cities){
            String lowerCaseCity = city.toLowerCase();
            
            
            if(cache.contains(lowerCaseCity)){ // 재사용 경우
                answer += 1;
                cache.remove(lowerCaseCity);
                cache.addFirst(lowerCaseCity);
            } else{ // 헤드에 추가
                answer += 5;
                
                if(cache.size() == cacheSize) cache.removeLast();
                
                cache.addFirst(lowerCaseCity);
            }
        }
        
        return answer;
    }
}

// 도시 이름은 영문자로 구성되며, 대소문자 구분 x

/*

head(가장 최근) - - - tail(가장 오래된)
hit = 재사용 = 1
miss = 헤드에 추가 된 경우 = 5
*/