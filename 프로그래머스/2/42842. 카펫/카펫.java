class Solution {
    /**
    @param brown 갈색 격자의 수
    @param yellow 노란색 격자의 수
    return 카펫의 가로, 세로 크기
    b의 개수는 노란색 가로*2 + 노란색 세로*2 + 4
    **/
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        boolean isbrownCheck = false;
        int totalCnt = brown + yellow;
        
        // 
        for (int h = 3; h <= Math.sqrt(totalCnt); h++) {
            
                int w = totalCnt / h;

                if ((w - 2) * (h - 2) == yellow) {
                    return new int[]{w, h};
                }
            
        }
        
        
        return null;
    }
}
// 중앙에는 노란색, 테두리 1줄은 갈색
// 카펫의 길이 가로 <= 세로(정사각형인 경우, 직사각형인 경우)
// 직사각형인 경우 b의 갯수는 = (y의 갯수 + 2) * 2 + 2
// 직사각형이든 정사각형이든
// b의 개수는 = {(노란색 가로 + 2) * 2} + (세로 길이 * 2)
// b의 개수는 노란색 가로*2 + 4 + 세로 길이*2

// 노란색이 존재하려면 높이는 최소 3
// w * h = 타일 갯수, w = 타일 갯수 / h
// h <= w
// h * h <= h * w(타일 갯수)
// 노란색 타일 갯수 = (w - 2) * (h - 2)

