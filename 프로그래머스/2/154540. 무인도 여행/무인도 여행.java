import java.util.*;

class Solution {
    public int[] solution(String[] maps) {
        int n = maps.length;           // 행 개수
        int m = maps[0].length();      // 열 개수 (직사각형 보장)
        
        // 방문 체크 배열
        boolean[][] visited = new boolean[n][m];

        // 결과(각 섬의 식량 합)를 담을 리스트
        List<Integer> sums = new ArrayList<>();

        // 4방향 이동 벡터(상, 하, 좌, 우)
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // 모든 칸을 순회하며 아직 방문하지 않았고 'X'가 아닌 칸에서 시작
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (!visited[r][c] && maps[r].charAt(c) != 'X') {
                    
                    int sum = 0;
                    Queue<int[]> q = new ArrayDeque<>();
                    q.offer(new int[]{r, c});
                    visited[r][c] = true;

                    while (!q.isEmpty()) {
                        int[] cur = q.poll();
                        int cr = cur[0], cc = cur[1];

                        // 현재 칸의 숫자(문자 '1'~'9')를 정수로 변환하여 더함
                        sum += maps[cr].charAt(cc) - '0';

                        // 4방향 인접 칸 확인
                        for (int k = 0; k < 4; k++) {
                            int nr = cr + dr[k];
                            int nc = cc + dc[k];

                            // 격자 범위 안 / 미방문 / 바다가 아닌 경우에만 이동
                            if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                                if (!visited[nr][nc] && maps[nr].charAt(nc) != 'X') {
                                    visited[nr][nc] = true;
                                    q.offer(new int[]{nr, nc});
                                }
                            }
                        }
                    }

                    
                    sums.add(sum);
                }
            }
        }

        if (sums.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(sums);
        int[] answer = new int[sums.size()];
        for (int i = 0; i < sums.size(); i++) {
            answer[i] = sums.get(i);
        }
        
        return answer;
    }
}
