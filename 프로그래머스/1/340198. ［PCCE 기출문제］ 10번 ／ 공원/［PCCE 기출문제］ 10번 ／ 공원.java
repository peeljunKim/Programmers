import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int rows = park.length; // 가로
        int cols = park[0].length; // 세로
        
        Integer [] copyMats = Arrays.stream(mats).boxed().toArray(Integer[] :: new );
        // 가장 큰 돗자리를 피니거니 내림차순 정렬
        Arrays.sort(copyMats, Collections.reverseOrder());

        for(int matSize : copyMats){
            
            if (matSize > rows || matSize > cols) {
                continue; // 다음 돗자리 크기로 건너뛰기
            }
            
            
            for(int i=0; i <= rows - matSize; i++){ 
                for(int j=0; j <= cols - matSize; j++){ 
                    
                    boolean isFindMat = true; // 돗자리 까는 여부
                    
                    for(int r = i; r < i + matSize; r++){
                        for(int c = j; c < j + matSize; c++){
                            if(!park[r][c].equals("-1")){
                                isFindMat = false;
                                break; // 돗자리를 못까니까 for문 탈출 1
                            }
                        }
                        
                        if (!isFindMat) break; // 돗자리를 못까니까 for문 탈출 2
                    }
                    
                    if(isFindMat){
                        return matSize;
                    }
                    
                    
                }
            }
        }
        

        return answer;
    }
}


// 공원에 이미 돗자리가 존재하고, 가장 큰 돗자리를 피려고한다. 돗자리를 필수 없으면 -1 반환
// @param mats 내가 가지고 있는 돗자리 한변의 길이 (정사각형)
// @param park 공원 현황 park (정사각형 아님)