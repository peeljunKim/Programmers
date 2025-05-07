class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int [4];
        int row = wallpaper[0].length(); // 가로
        int col = wallpaper.length; // 세로
        
        // int cnt = 0;
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        
        for(int i=0; i<col; i++){ // 세로
            String fileExistWithString = wallpaper[i];
            for(int j =0; j<row; j++){ // 가로
                if(fileExistWithString.charAt(j) == '#'){
                    if(i < lux) lux = i;
                    if(j < luy) luy = j;
                    if(i + 1 > rdx) rdx = i + 1;
                    if(j + 1 > rdy) rdy = j + 1;
                    
                    // System.out.print("x 좌표 =  " + i + ", y 좌표 = " + j);
                    // System.out.println(" Is Exist file = " + ++cnt);
                    // 여기서 i, j는 파일 왼쪽 위 좌표
                    // S격자점을 구할 때는 상관 x 하지만 E를 구할 때 좌표에 +1 씩
                }
                
            }
        }
        // System.out.println("lux = " + lux+", luy = " + luy);
        // System.out.println("rdx = " + rdx+", rdy = " + rdy);
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx;
        answer[3] = rdy;
        
        
        return answer;
    }
}
// 가장 왼쪽 위 좌표가 (0,0) (세로, 가로)
// 바탕화면 격자점 S(lux, luy)를 마우스 왼쪽 버튼으로 클릭한 뒤. S=시작점
// 격자점 E(rdx, rdy)로 이동한 뒤 마우스 왼쪽 버튼을 떼는 행동 E=끝점
// 위 행동을 점 S에서 점E로 드래고한다고 표현
// 드래그 거리 계산법 |rdx - lux| + |rdy - luy|로 정의
// lux, luy, rdx, rdy를 반환

// 제한사항
// 적어도 한 개의 파일 존재
// lux < rdx && luy < rdy을 만족


// S는 x, y 좌표가 최소값, E는 x, y 좌표가 최댓값
