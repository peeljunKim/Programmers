import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int height = park.length; // 세로
        int width = park[0].length(); // 가로
        char[][] parkGrid = new char[height][width]; // 공원
        int startRow = -1; // 시작 위치
        int startCol = -1; 

        
        for (int i = 0; i < height; i++) {
            parkGrid[i] = park[i].toCharArray();
            int sCol = park[i].indexOf('S');
            if (sCol != -1) {
                startRow = i; 
                startCol = sCol; 
            }
        }

        // 현재 위치 초기화
        int currentRow = startRow;
        int currentCol = startCol;

        Map<Character, int[]> map = new HashMap<>();
        map.put('N', new int[]{-1, 0}); // 북쪽
        map.put('S', new int[]{1, 0}); // 남쪽
        map.put('W', new int[]{0, -1}); // 서쪽
        map.put('E', new int[]{0, 1});  // 동쪽

        for (String route : routes) {
            String[] command = route.split(" ");
            char direction = command[0].charAt(0); // 방향 (N, S, W, E)
            int distance = Integer.parseInt(command[1]); // 거리

            int[] arr = map.get(direction);
            int dr = arr[0]; // 세로 이동량
            int dc = arr[1]; // 가로 이동량

            int nextRow = currentRow + dr * distance;
            int nextCol = currentCol + dc * distance;

            boolean isPossible = true; // 수행 가능 여부

            // 경계 이탈 여부 확인
            if (nextRow < 0 || nextRow >= height || nextCol < 0 || nextCol >= width) {
                isPossible = false; 
            }

            // 경로 내 장애물 여부 확인
            if (isPossible) {
                int checkRow = currentRow;
                int checkCol = currentCol;
                
                for (int i = 0; i < distance; i++) {
                    checkRow += dr; 
                    checkCol += dc; 
                    if (parkGrid[checkRow][checkCol] == 'X') {
                        isPossible = false; 
                        break; 
                    }
                }
            }

            if (isPossible) {
                currentRow = nextRow;
                currentCol = nextCol;
            }
            
        }

        int[] answer = new int[2]; 
        answer[0] = currentRow; 
        answer[1] = currentCol; 

        return answer;
    }
}
