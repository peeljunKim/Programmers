import java.util.*;
class Solution {
    /*
    @param dirs 캐릭이 움직일 명령어
    return 캐릭터가 처음 걸어본 길의 길이
    */
    public int solution(String dirs) {
        int answer = 0;
        Set<String> set = new HashSet<>(); // 다녀간 좌표 저장 객체
        // 캐릭터가 이동한 길을 구해야 되기 때문에 이동 전 좌표, 이동 후 좌표를 저장
        
        // 캐릭터 현재 좌표
        int x = 0;
        int y = 0;
        
        for(char coordinate : dirs.toCharArray()){
            // 이전 좌표
            int prevX = x;
            int prevY = y;
            // 다음 좌표
            int nextX = x;
            int nextY = y;
            
            switch (coordinate) {
                case 'U':
                    nextY++;
                    break;
                case 'D':
                    nextY--;
                    break;
                case 'R':
                    nextX++;
                    break;
                case 'L':
                    nextX--;
                    break;
            }
            
            if(nextX > 5 || nextX < -5 || nextY > 5 || nextY < -5) continue;
        
            String path = "";
            if (prevX < nextX || (prevX == nextX && prevY < nextY)) {
                path = prevX + "," + prevY + "," + nextX + "," + nextY;
            } else {
                path = nextX + "," + nextY + "," + prevX + "," + prevY;
            }
            
            set.add(path);
            x = nextX;
            y = nextY;
            
        }
        // System.out.println(set);
        answer = set.size();
        
        return answer;
    }
}

// 좌표평면 5 x 5, 초기좌표 (0,0)
// 맵 이상으로 캐릭이 나가면 해당 명령어 무시