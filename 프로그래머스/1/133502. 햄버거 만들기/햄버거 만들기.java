import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int temp : ingredient){ 
            stack.push(temp);
            // System.out.println(stack.get(0));
            if (stack.size() >= 4) {
                if (stack.get(stack.size() - 1) == 1 && // 빵
                    stack.get(stack.size() - 2) == 3 && // 고기
                    stack.get(stack.size() - 3) == 2 && // 야채
                    stack.get(stack.size() - 4) == 1) { // 빵
         
                    
                    stack.pop(); 
                    stack.pop(); 
                    stack.pop(); 
                    stack.pop(); 
                    answer++; 
                }
            }
        }
        
        
        return answer;
    }
}
//         1    2      3    1
// 아래부터 빵 - 야채 - 고기 - 빵 순으로 햄버거 포장