class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        int[] dh = {0, 1, -1, 0}; // h의 변화량
        int[] dw = {1, 0, 0, -1}; // w의 변화량
        // h 0 w 1
        for(int i= 0; i < 4; i++){
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            
            if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < n){
                    if(board[h][w].equals(board[h_check][w_check])){
                        answer++;
                    }
            }    
        }
        
        return answer;
    }
}

// board[h][w] h = 위 아래, w = 왼쪽, 오른쪽
// 