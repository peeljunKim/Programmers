import java.util.*;
class Solution {
    /**
    @param k 상자에 귤을 담으려는 개수
    @param tangerine 귤의 크기
    **/
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>(); // key 귤 크기, value 귤 개수
        
        for(int size : tangerine){
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(); // 귤 개수
        for(int temp : map.values()){
            list.add(temp);
        }
        Collections.sort(list, Collections.reverseOrder());
        
        int cnt = 0;
        for (int temp : list) {
            cnt += temp;
            answer++;
            
            if (cnt >= k) {
                break; 
            }
        }
        
        // Arrays.sort(tangerine);
        // System.out.println(map);
        // System.out.println("list = " + list);
        
        return answer;
    }
}