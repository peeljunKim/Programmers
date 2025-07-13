import java.util.*;
class Solution {
    
    private final int [][] COST = {
            {1, 1, 1},
            {5, 1, 1},
            {25, 5, 1}
        };
    
    private int answer = Integer.MAX_VALUE;
    
    /*
    @param picks 곡괭이 개수 배열(다이아, 철, 돌 순서대로)
    @param minerals 광물 순서 문자열
    return 최소한의 피로도
    */
    public int solution(int[] picks, String[] minerals) {
        // int answer = Integer.MAX_VALUE;
        dfs(picks, 0, minerals, 0);
        return answer;
    }
    
    
    /*
     @param currentPicks 남은 곡괭이 개수 (다이아몬드, 철, 돌 순서대로)
     @param mineralIdx 현재 캘 광물의 시작 인덱스
     @param minerals 광물 배열
     @param currentCost 누적된 피로도
     */
    private void dfs(int[] currentPicks, int mineralIdx, String[] minerals, int currentCost) {

        // 모든 광물을 다 캔 경우 + 더 이상 사용할 곡괭이가 없는 경우
        if (mineralIdx >= minerals.length || 
            (currentPicks[0] == 0 && currentPicks[1] == 0 && currentPicks[2] == 0)) {
            answer = Math.min(answer, currentCost);
            return;
        }

        // 현재 피로도가 이미 최소 피로도보다 크거나 같으면 더 이상 탐색할 필요 없음
        if (currentCost >= answer) {
            return;
        }

        // 0 = 다이아, 1 = 철, 2 = 돌
        for (int i = 0; i < currentPicks.length; i++) {
            if (currentPicks[i] > 0) { 
                currentPicks[i]--; 

                int plusCost = 0; // 이번 곡괭이로 캘 광물 피로도
                int nextMineralIdx = mineralIdx; // 다음 탐색을 시작할 광물 인덱스

                // 곡괭이 하나로 최대 5개의 광물을 캘 수 있음
                for (int j = 0; j < 5; j++) {
                    if (nextMineralIdx + j < minerals.length) { 
                        String mineral = minerals[nextMineralIdx + j];
                        
                        if (mineral.equals("diamond")) {
                            plusCost += COST[i][0];
                        } else if (mineral.equals("iron")) {
                            plusCost += COST[i][1];
                        } else if (mineral.equals("stone")) {
                            plusCost += COST[i][2];
                        }
                    } else {
                        // 광물이 부족해서 5개를 다 못 캔 경우
                        break;
                    }
                }

                // 현재 곡괭이 사용 후 남은 곡괭이 개수, 다음 광물 시작 인덱스, 누적 피로도
                dfs(currentPicks, 
                    nextMineralIdx + 5, 
                    minerals, 
                    currentCost + plusCost);

                currentPicks[i]++;
            }
        }
    }
}

// 각 곡괭이 0 ~ 5, 곡괭이로 광물을 캘 때 피로도 소모
// 한 번 사용한 곡괭이는 끝까지 사용
// 모든 광물을 캐거나, 곡괭이를 사용할 수 없을 때 까지
// 곡괭이 하나 당 5개 광물 가능

