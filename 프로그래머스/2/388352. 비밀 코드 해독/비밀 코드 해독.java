class Solution {
    public int solution(int n, int[][] q, int[] ans) {
        int answer = 0;
        
        int m = q.length;              // 시도 횟수
        int[] queryMask = new int[m];  // 각 시도를 비트마스크로 변환
        
        for (int i = 0; i < m; i++) {
            int mask = 0;
            for (int num : q[i]) {
                // num은 1~n 이므로 비트 위치는 (num - 1)
                mask |= (1 << (num - 1));
            }
            queryMask[i] = mask;
        }
        
        for (int a = 0; a < n - 4; a++) {
            for (int b = a + 1; b < n - 3; b++) {
                for (int c = b + 1; c < n - 2; c++) {
                    for (int d = c + 1; d < n - 1; d++) {
                        for (int e = d + 1; e < n; e++) {
                            
                            int codeMask = (1 << a) | (1 << b) | (1 << c) | (1 << d) | (1 << e);

                            if (isValid(codeMask, queryMask, ans)) {
                                answer++;
                            }
                        }
                    }
                }
            }
        }
        
        return answer;
    }
    
    private boolean isValid(int codeMask, int[] queryMask, int[] ans) {
        int m = queryMask.length;

        for (int i = 0; i < m; i++) {
            // 해당 시도에서 맞춘 숫자의 개수
            int intersectionCount = Integer.bitCount(codeMask & queryMask[i]);

            if (intersectionCount != ans[i]) {
                return false;
            }
        }

        return true;
    }
}