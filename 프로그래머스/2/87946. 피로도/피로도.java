import java.util.*;

class Solution {
    private int answer = 0;
    /** 
    @param k 현재 피로도
    @param dungeons 던전별 {최소 필요 피로도, 소모 피로도}가 담긴 2차 배열
    return 탐험할 수 있는 최대 던전 
    **/
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        boolean [] isVisit = new boolean[dungeons.length]; // 각 던전 방문 여부
        System.out.println(Arrays.toString(isVisit));
        example(k, dungeons, isVisit, 0);
        
        return answer;
    }
    /**
     @param currentK 현재 남은 피로도
     @param dungeons 모든 던전 정보 2차원 배열
     @param visited 각 던전의 방문 여부 배열
     @param count 현재까지 탐험한 던전 수
     **/
    private void example (
        int currentK, int[][] dungeons, 
        boolean[] isVisit, int count) {
        
        answer = Math.max(answer, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!isVisit[i] && currentK >= dungeons[i][0]) {
                isVisit[i] = true;

                example(currentK - dungeons[i][1], dungeons, isVisit, count + 1);

                isVisit[i] = false;
            }
        }
    }
}