import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
        int weight = 0;
        
        for(int i=0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
            
            if(width <= sizes[i][0]){
                width = sizes[i][0];
            }
            if(weight <= sizes[i][1]){
                weight = sizes[i][1];
            }
        }
        // System.out.println(Arrays.deepToString(sizes));
        // System.out.println("weight = " + weight + "\nwidth = " + width);
        answer = width * weight;
        
        return answer;
    }
}

// w, h를 정렬 후
// w은? h는 가장 큰 수
// 60 50
// 70 30
// 60 30
// 80 40