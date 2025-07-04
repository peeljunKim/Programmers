import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0; i<sb.length(); i++){
            char firstChar = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(firstChar);
            
            if(isMatch(sb.toString())) answer++;
        }
        
        return answer;
    }
    
    public boolean isMatch(String str){
        Stack<Character> stack = new Stack();
        
        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                
                // System.out.println("top = " + stack.peek());
                char top = stack.pop();
                
                if (ch == ')' && top != '(')  return false;
                else if (ch == ']' && top != '[') return false;
                else if (ch == '}' && top != '{') return false;
                
            }
        }
        
        return stack.isEmpty();
    }
        
}