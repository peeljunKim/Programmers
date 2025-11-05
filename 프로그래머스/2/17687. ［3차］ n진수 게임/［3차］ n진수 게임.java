import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        int num = 0;
        while (sb.length() < t * m) {
            sb.append(toBase(num, n));
            num++;
        }
        
        for (int i = p - 1; answer.length() < t; i += m) {
            answer.append(sb.charAt(i));
        }

        return answer.toString();
    }
    
        private static String toBase(int num, int base) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        int current = num;
        while (current > 0) {
            int r = current % base;
            // 0~9는 숫자, 10~15는 A~F
            if (r < 10) {
                sb.append(r);
            } else {
                sb.append((char) ('A' + (r - 10)));
            }
            current /= base;
        }
            
        return sb.reverse().toString();
    }
}

