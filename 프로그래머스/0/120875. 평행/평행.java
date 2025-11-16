class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) {
            return 1;
        }
        
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) {
            return 1;
        }
        
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) {
            return 1;
        }
        return answer;
    }
    
    
    
    // 두 직선 (p1-p2) 와 (p3-p4)가 평행한지 확인
    private boolean isParallel(int[] p1, int[] p2, int[] p3, int[] p4) {
        // 첫 번째 직선의 방향 벡터 (dx1, dy1)
        int dx1 = p2[0] - p1[0];  // x2 - x1
        int dy1 = p2[1] - p1[1];  // y2 - y1
        
        // 두 번째 직선의 방향 벡터 (dx2, dy2)
        int dx2 = p4[0] - p3[0];  // x4 - x3
        int dy2 = p4[1] - p3[1];  // y4 - y3
        
        return dy1 * dx2 == dy2 * dx1;
    }
}