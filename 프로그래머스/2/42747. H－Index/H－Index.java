import java.util.*;

class Solution {
    /**
    @param citations 논문 인용 횟수
    **/
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        Arrays.sort(citations);
        
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i; 
            }
        }
        
        return answer;
    }
}
// citations.length = n

