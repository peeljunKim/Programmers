class Solution {
    /**
    m: 세로
    n: 가로
    * = 빈칸 처리
    **/
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        char[][] map = new char[m][n];
        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }
        
        while (true) {
            boolean[][] check = new boolean[m][n]; // 지워지는 칸
            boolean hasMatch = false;              // 지울 블록이 있는지 여부

            // 2x2 같은 블록 찾기
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char c = map[i][j];

                    if (c == '*') continue;

                    // 현재 칸 2x2 블록 같은 문자면 체크
                    if (c == map[i][j + 1] &&
                        c == map[i + 1][j] &&
                        c == map[i + 1][j + 1]) {

                        check[i][j] = true;
                        check[i][j + 1] = true;
                        check[i + 1][j] = true;
                        check[i + 1][j + 1] = true;
                        hasMatch = true;
                    }
                }
            }

            if (!hasMatch) {
                break;
            }

            // 체크된 블록 실제로 제거
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (check[i][j]) {
                        map[i][j] = '*'; // 빈칸 표시용 문자
                        answer++; // 제거 횟수 카운터
                    }
                }
            }

            // 블록을 아래로 떨어뜨리기
            for (int j = 0; j < n; j++) {
                // 아래쪽에서부터 채워 넣을 위치
                int writeRow = m - 1;

                // 아래 -> 위, 빈칸이 아닌 블록들을 아래로 내림
                for (int i = m - 1; i >= 0; i--) {
                    if (map[i][j] != '*') { 
                        char temp = map[i][j];
                        map[i][j] = '*';        
                        map[writeRow][j] = temp; // 아래쪽으로 내려서 채움
                        writeRow--;
                    }
                }
            }
        }

        return answer;
    }
}

// 라이언(R), 무지(M), 어피치(A), 프로도(F), 네오(N), 튜브(T), 제이지(J), 콘(C)