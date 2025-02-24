import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = -1;
        int cnt = 0;
        Map<Integer ,Integer> map = new HashMap<>();
        
        for(int i=0; i<array.length; i++){    
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        
        System.out.println(map);
        System.out.println(list);
        
        for(int num : list){
            if(max < map.get(num)){
                max=map.get(num);
                answer = num;
            }
        }
        
        for(int value : map.values()){
            if(value == max){
                cnt++;
            }
        }
        
        if(cnt >= 2){
            answer = -1;
        } 
        
        
        return answer;
    }
}