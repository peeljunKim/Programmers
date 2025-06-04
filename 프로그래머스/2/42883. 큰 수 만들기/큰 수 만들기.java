import java.util.*;
class Solution {
    /*
    @param number 문자열 형식 숫자
    @param k 제거할 수의 개수
    return 만들 수 있는 가장 큰 숫자
    */
    public String solution(String number, int k) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        // List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<number.length(); i++){
            char ch = number.charAt(i);
            
            while(!stack.isEmpty() && k>0 && stack.peek() < ch){
                // System.out.println("i = " + i + ", stack = " + stack.peek());
                // list.add(i-1);
                stack.pop();
                k--;
            }
            
            stack.add(ch);
        }
        
        while(k>0){
            stack.pop();    
            k--;
        }
        // System.out.println(stack);
        
        while (!stack.isEmpty()) {
             sb.insert(0, stack.pop());
        }
        
        
        // list.sort(Collections.reverseOrder());
        // for(int i=0; i<list.size(); i++){
        //     sb.deleteCharAt(list.get(i));
        // }
        // System.out.println(sb.toString());
        
        return sb.toString();
    }
}
// 이건 그리드 알고리즘인데 정렬을 하면 안됨