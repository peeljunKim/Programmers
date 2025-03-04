class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0];
        int x2 = dots[1][0];
        int y1 = dots[0][1];
        int y2 = dots[2][1];
        for (int[] dot : dots) {
            x1 = Math.min(x1, dot[0]);
            x2 = Math.max(x2, dot[0]);
            y1 = Math.min(y1, dot[1]);
            y2 = Math.max(y2, dot[1]);
        }
        
        int answer = Math.abs(x2 - x1) * Math.abs(y2 - y1); 
        
        return answer;
    }
}

// 직사각형의 좌표 = dots
// idx ==0, x1 y1     
// 2, x2 y2
// 3 x3 y3
// 4 x4 y4