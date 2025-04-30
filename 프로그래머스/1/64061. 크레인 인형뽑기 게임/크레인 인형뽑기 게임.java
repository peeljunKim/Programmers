import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0; 
        Stack<Integer> basket = new Stack<>(); // 인형을 담을 바구니

       
        for (int move : moves) {
            int col = move - 1; 

            for (int row = 0; row < board.length; row++) {
                int temp = board[row][col]; // 인형

                // 인형이 있는 칸(0이 아닌 값)을 찾으면
                if (temp != 0) {
                    // 바구니가 비어있지 않고, 바구니 맨 위 인형과 현재 인형의 모양이 같으면
                    if (!basket.isEmpty() && basket.peek() == temp) {
                        basket.pop(); 
                        answer += 2; 
                    } else {
                        // 바구니가 비어있거나 맨 위 인형과 모양이 다르면
                        basket.push(temp); // 인형을 바구니에 담음
                    }

                    board[row][col] = 0; // 인형을 뽑은 자리는 0으로 비워둠
                    break; // 현재 move에 대해 인형 하나를 뽑았으므로 다음 move로 넘어감
                }
            }
            
        }

        return answer; 
    }
}
