import java.util.*;
class Solution {
    /*
    @param n 초기 병사 수
    @param k 사용할 수 있는 무적권
    @param enemy 라운드 별 적 인원 배열
    return 몇 라운드까지 막을 수 있는지
    */
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        if(enemy.length == k) return enemy.length;
        
        long soldier = n;
        int ablity = k;
        
        // 무적권 사용할 곳
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // 일단 막아보고 막은 라운드에서 가장 큰 적군이 있을 때 무적권 사용
        for(int i=0; i<enemy.length; i++){
            int currentEnemy = enemy[i];
            pq.add(currentEnemy);
            // System.out.println("pq = " + pq);
            
            soldier -= currentEnemy;
            
            if(soldier < 0){
                if(ablity > 0){
                    // System.out.println("peek = " + pq.peek());
                    soldier += pq.poll();
                    ablity--;
                } else{
                    break;
                }
            }
            
            answer++;
        }
        
        
        return answer;
    }
}