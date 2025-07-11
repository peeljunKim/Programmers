import java.util.*;
class Solution {
    public String solution(String p) {
        String answer = "";
        if(p.isEmpty()) return "";
        
        int openCnt = 0; // (의 개수
        int closeCnt = 0; // )의 개수
        int idx = 0; // u의 인덱스
        
        for(int i=0; i<p.length(); i++){
            if (p.charAt(i) == '(') {
                openCnt++;
            } else {
                closeCnt++;
            }
            
            // 2 균형잡인 괄호 문자열 
            if (openCnt == closeCnt) {
                idx = i;
                break;
            }
        }
        
        String u = p.substring(0, idx+1);
        String v = p.substring(idx + 1);
        
        // 3. u가 올바른 괄포 문자열인지 확인 
        if (isCorrect(u)) {
            return u + solution(v); // 3-1
        } else{
            StringBuilder sb = new StringBuilder("("); // 4-1
            sb.append(solution(v)); // 4-2
            sb.append(")"); // 4-3
            sb.append(reverse(u.substring(1, u.length() - 1))); // 4-4
            return sb.toString();
        }
    }
    
    // 괄포 방향 뒤집는 함수
    private String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                sb.append(')');
            } else {
                sb.append('(');
            }
        }
        return sb.toString();
    }
    
    
    // 문자열이 올바른 괄호 문자열인지 확인하는 함수
    private boolean isCorrect(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else { 
                if (stack.isEmpty()) { // 처음에 (이 나오면 올바른 괄호 문자열이 아님
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty(); // 모든 괄호가 짝을 맞췄으면 스택이 비어있어야 함
    }
    
}

/*
()로만 이루어지고 개수가 동일하면 = 균형잡힌 괄호 문자열
+ ()괄호의 짝도 모두 맞을 경우 = 올바른 괄호 문자열

매개변수 p를 이루는 ()의 개수는 항상 같음
만약 이미 올바른 괄호 문자열이면 그대로 반환
*/