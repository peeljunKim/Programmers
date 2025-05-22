import java.util.*;
class Solution {
    /*
    @param 게임 맵의 상태 maps (벽 0, 길 1)
    return 상대 진영을 가기 위한 최소칸 반환, 불가능 하면 -1
    */
    public int solution(int[][] maps) {
        int answer = -1;
        int n = maps.length; // 행
        int m = maps[0].length; // 세로
        int[] dr = {-1, 1, 0, 0}; // 위, 아래, 변화 없음, 변화 없음
        int[] dc = {0, 0, -1, 1}; // 변화 없음, 변화 없음, 왼쪽, 오른쪽
        
        // 목표 지점까지 각 칸의 최단 거리
        int[][] distance = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                distance[i][j] = -1;
            }
        }
        
        // 캐릭이 가는 좌표 저장
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0}); // 초기 위치
        distance[0][0] = 1;
        
        while(!queue.isEmpty()){
            int[] currentLocation = queue.poll();
            int r = currentLocation[0]; // 현재 칸의 행 좌표
            int c = currentLocation[1]; // 현재 칸의 열 좌표
            int currentDist = distance[r][c];
            
            if (r == n - 1 && c == m - 1) {
                return currentDist;
            }
            
            
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i]; // 다음 칸 행 좌표
                int nc = c + dc[i]; // 다음 칸 열 좌표

                // 이동할 다음 칸이 유효한 범위인지 확인
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    // 이동할 칸이 벽이 아니고, 아직 방문하지 않은 경우
                    if (maps[nr][nc] == 1 && distance[nr][nc] == -1) {
                        distance[nr][nc] = currentDist + 1;
                        queue.add(new int[]{nr, nc});
                    }
                }
            }
            
        
        }
        
        return answer;
    }
}


// n과 m이 모두 1인 경우 x 1~100
// 내 캐릭 초기 위치는 좌측 상단(1, 1) 상대방 진영은 우측 하단(n, m)