import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        
        for (char c : skip.toCharArray()) {
            set.add(c);
        }
        
        for (char ch : s.toCharArray()) {
            int cnt = 0;
            char nextChar = ch;

            while (cnt < index) {
                nextChar++;

                if (nextChar > 'z') {
                    nextChar = 'a';
                }

                if (!set.contains(nextChar)) {
                    cnt++;
                }
            }
            // System.out.println(nextChar);
            sb.append(nextChar);
        }
        
        
        answer = sb.toString();
        
        return answer;
    }
}
// 매개변수 s를 매개변수 index만큼 뒤로 보냄
// 단! 매개변수 skip에 있는 알페벳은 카운팅 x