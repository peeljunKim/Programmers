import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int [] distinct = new int[201];
        
        for(int[] line : lines){
            int start = line[0];
            int end = line[1];
            for (int i = start; i < end; i++) { // 끝점 포함하면 선분A의 끝점과 선분B의 시작점 일 때 오류 발생
                distinct[i + 100]++;
            }
        }
        
        for (int temp : distinct) {
            if (temp > 1) {
                answer++;
            }
        }

        
        // List<Integer> distinct = new ArrayList<>();
        
//         for(int i=0; i<lines.length-1; i++){ 
//             int start = lines[i][0];
//             int end = lines[i][1];
            
//             int next_start = lines[i+1][0];
//             int next_end = lines[i+1][1];
            
//             for(int j=start; j<end; j++){
                
//             }
//         }
        // Collections.sort(distinct, (a, b) -> a.compareTo(b));
        
        return answer;
    }
}