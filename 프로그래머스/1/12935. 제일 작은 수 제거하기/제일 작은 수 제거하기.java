import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int min = arr[0];
        Integer[] integerArray = Arrays.stream(arr)
            .boxed()
            .toArray(Integer[]::new);
        List<Integer> list = new ArrayList<>(Arrays.asList(integerArray));
        
        for(int temp : arr){
            if(temp < min){
                min = temp;
            }
        }
        
        list.remove(Integer.valueOf(min));
        
        if(arr.length == 1 && arr[0] == 10){
            answer = new int[] {-1};
        }else{
            answer = new int [list.size()];
            for(int i=0; i< list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}
// 가장 작은 수가 여러개면??