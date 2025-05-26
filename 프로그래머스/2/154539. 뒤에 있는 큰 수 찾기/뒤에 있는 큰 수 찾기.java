import java.util.*;
class Solution {
    /*
    @param numbers 정수 배열
    */
    public int[] solution(int[] numbers) {
        int[] answer = new int [numbers.length];
        Arrays.fill(answer, -1);
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < numbers.length; i++) {
            
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                int temp = stack.peek();
                int idx = stack.pop();
                answer[idx] = numbers[i];
                // System.out.println("idx = " + temp +", numbers[i] = " + numbers[i]);
            }
            stack.push(i);
        }
 
        
        return answer;
    }
}

// 각 원소들 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수를 뒷 큰수
// 4 ≤ numbers의 길이 ≤ 1,000,000