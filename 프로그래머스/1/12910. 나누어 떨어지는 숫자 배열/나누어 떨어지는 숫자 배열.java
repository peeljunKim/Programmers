import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int temp : arr){
            if(temp % divisor == 0){
                list.add(temp);
            }
        }
        int[] answer;
        if(list.size() == 0){
            answer = new int[] {-1};
        }else{
            answer = new int [list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        // System.out.println(list);
        
        return answer;
    }
}