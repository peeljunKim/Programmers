import java.util.*;

class Solution {
    public int solution(String s) {
        
        int n = s.length();
        if (n == 1) return 1;
        
        int answer = n;
        
        for (int k = 1; k <= n / 2; k++) {
            StringBuilder sb = new StringBuilder();
            String prev = s.substring(0, k); 
            int cnt = 1;                     

            int i = k;
            while (i + k <= n) {
                String current = s.substring(i, i + k);
                if (prev.equals(current)) {
                    cnt++; 
                } else {
                    // 지금까지의 블록(prev)을 결과에 반영
                    if (cnt > 1) sb.append(cnt); // 1회는 생략
                    sb.append(prev);
                    
                    // 현재 블록으로 갱신
                    prev = current;
                    cnt = 1;
                }
                i += k;
            }

            // 마지막으로 누적된 블록 반영
            if (cnt > 1) sb.append(cnt);
            sb.append(prev);

            if (i < n) sb.append(s.substring(i));

            answer = Math.min(answer, sb.length());
        }
        
        return answer;
    }
}