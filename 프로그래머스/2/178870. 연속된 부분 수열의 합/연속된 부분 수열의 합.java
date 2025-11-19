class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int [2];
        
        int n = sequence.length;

        int left = 0; // 왼쪽 값       
        long sum = 0L;           

        int startIdx = 0;           
        int endIdx = n - 1;       
        int minLen = Integer.MAX_VALUE;  // 현재까지 찾은 최소 길이
        
        // i = 오른쪽 값
        for (int i = 0; i < n; i++) {
            sum += sequence[i];  // 오른쪽 값 포함

            // 현재 합이 k를 초과하면, left를 이동시키며 줄이기
            while (sum > k && left <= i) {
                sum -= sequence[left];
                left++;
            }

            // 합이 정확히 k인 구간 발견
            if (sum == k) {
                int len = i - left + 1;  // 현재 구간 길이

                // 더 짧은 구간이면 갱신
                if (len < minLen) {
                    minLen = len;
                    startIdx = left;
                    endIdx = i;
                }
            }
        }

        answer[0] = startIdx;
        answer[1] = endIdx;
        
        return answer;
    }
}