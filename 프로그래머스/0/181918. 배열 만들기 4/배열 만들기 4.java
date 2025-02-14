import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(i < arr.length){
            if(list.size() == 0){
                list.add(arr[i]);
                i++;
            } else{
                int temp = list.get(list.size() - 1);
                if(list.size() != 0 && temp < arr[i]){
                    list.add(arr[i]);
                    i++;
                } else if(list.size() != 0 && temp >= arr[i]){
                    list.remove(list.size()-1);
                }
            }
        }
        
        int[] stk = new int[list.size()];
        for(int j = 0; j < stk.length; j++){
            stk[j] = (int) list.get(j);
        }

        return stk;
    }
}