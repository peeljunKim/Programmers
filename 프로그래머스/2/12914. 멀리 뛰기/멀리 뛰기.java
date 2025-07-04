class Solution {
    
    private static final int MOD = 1234567;
    
    /*
    @param n 뛰어야 되는 칸 수 
    return 뛸 수 있는 경우의 수 % 1234567
    */
    public long solution(int n) {
        if(n == 1) return 1L;
        
        
        int[] dp = new int[n + 1];
        
        // 어차피 n이 1 이상이니 아래 조건절을 사용할 필요가 없음
        //if(n > 3){
            dp[1] = 1;
            dp[2] = 2; 
        //}
        
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }
        
        long answer = dp[n];
        
        return answer;
    }
}

// dfs로 못 풀거 같음

// 1칸 or 2칸만 뛸 수 있음

// 1
// 1 1 / 2
// 1 1 1 / 1 2 / 2 1
// 1 1 1 1 / 1 1 2 / 1 2 1 / 2 1 1 / 2 2
// 1 1 1 1 1 / 1 1 1 2 / 1 1 2 1 / 1 2 1 1 / 2 1 1 1 / 1 2 2 / 2 1 2 / 2 2 1 