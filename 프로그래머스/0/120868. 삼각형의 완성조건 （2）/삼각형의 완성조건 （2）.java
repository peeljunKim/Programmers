class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]); // 배열에서 가장 큰 변 
        int min = Math.min(sides[0], sides[1]);  
        int temp = max + 1; // 나머지 변이 가장 큰 경우의 최솟값
        int temp2 = Math.abs(sides[0]-sides[1]) +1; // 가장 긴 변이 배열이 있는 경우, 나머지 변 최소값
        
        while((sides[0] + sides[1]) > temp){ // 나머지 변기 가장 긴 변인 경우
            answer++;
            temp++;
        }
        
        while(temp2 <= max){
            answer++;
            temp2++;
        }
        
        return answer;
    }
}

// 가장 긴 변 x 다른 변을 y, z 가정
// y + z > x
// 해당 조건을 만족하는 경우의 수 찾기
// 피타고라스임? 뭐지?