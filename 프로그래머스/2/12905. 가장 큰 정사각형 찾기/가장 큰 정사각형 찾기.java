class Solution{
    public int solution(int [][]board){
        int answer = 0; // 한 변 길이
        int[] redirect = {1, 0, -1 ,0};
        int row = board.length; // 가로
        int col = board[0].length; // 세로
        
        
        int[][] dp = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            if (board[i][0] == 1) {
                dp[i][0] = 1;
                answer = 1; 
            }
        }
        
        for (int j = 0; j < col; j++) {
            if (board[0][j] == 1) {
                dp[0][j] = 1;
                answer = 1; 
            }
        }
        
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (board[i][j] == 1) {
                    
                    dp[i][j] = Math.min(dp[i-1][j]
                                        , Math.min(dp[i][j-1]
                                        , dp[i-1][j-1])) + 1;
                    // 현재까지 찾은 가장 큰 변의 길이 갱신
                    answer = Math.max(answer, dp[i][j]);
                } else {
                    dp[i][j] = 0; // 정사각형을 만들 수 없는 경우
                }
            }
        }
        
        return answer * answer;
    }
}