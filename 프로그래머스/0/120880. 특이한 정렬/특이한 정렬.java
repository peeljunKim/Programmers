import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        // int[] answer = new int[numlist.length];
        // List<Integer> numbersLength = new ArrayList<>();
        // for(int temp : numlist){
        //     numbersLength.add(Math.abs(n - temp));
        // }
        
        Arrays.sort(numlist);
        for(int i=0; i<numlist.length; i++){
            for(int j=0; j<numlist.length; j++){
                if(Math.abs(n-numlist[i]) <= Math.abs(n-numlist[j])){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }

        
        return numlist;
    }
}
// n으로 부터 거리가 같으면 더 큰수를 먼저 배치