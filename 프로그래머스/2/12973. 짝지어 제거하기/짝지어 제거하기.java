import java.util.*;
class Solution{
    // @param s 소문자로 이루어진 문자열
    public int solution(String s){
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            // 제거하는 경우 (stack에 비어있지 않고 최근 문자열이 같은 경우)
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            } else{
                stack.push(ch);
            }
            // System.out.println(stack);
        }

        // stack.isEmpty ? 1 : 0;
        return stack.isEmpty() ? 1 : 0;
    }
}
// 1. 같은 알파벳이 2개 붙어 있는 걸 찾는다.
// 2. 그 둘을 제거한 뒤 앞뒤로 이어 붙인다
// 문자열을 모드 제거하면 1을 반환, 아닐 경우 0 반환