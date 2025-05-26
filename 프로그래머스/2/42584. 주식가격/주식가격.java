import java.util.*;
class Solution {
    /*
    @param prices 초 단위로 기록된 주식가격이 담긴 배열
    return 가격이 떨어지지 않는 기간 몇 초인지
    */
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<prices.length; i++){
            // int cnt = 0;
            
            // 가격이 떨어지는 경우
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                int idx = stack.pop();
                answer[idx] = i-idx;
            }
            
            stack.push(i);
        }
        // System.out.println(stack);
        // System.out.println(Arrays.toString(answer));
        
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            answer[temp] = (prices.length - 1) - temp;
        }
        
        return answer;
    }
}
// prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
// prices의 길이는 2 이상 100,000 이하입니다.