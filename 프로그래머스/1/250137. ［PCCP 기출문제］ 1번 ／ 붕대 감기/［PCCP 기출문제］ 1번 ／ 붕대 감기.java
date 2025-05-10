class Solution {
    /**
    @param bandage {붕대 시전 시간, 1초당 회복량, 추가 회복량}
    @param health 최대 체력
    @param attacks 몬스터 공격 시간과 피해량 2차 배열
    @return 모든 공격이 끝난 뒤 체력 (만약 체력이 0이하면 -1)
    **/
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int CastingTime = bandage[0]; // 붕대 시전 시간
        int recovery = bandage[1]; // 1초당 회복량
        int plusRecovery = bandage[2]; // 추가 회복량
        
        int maxHealth = health; // 캐릭터의 최대 체력
        int currentHealth = health; // 현재 체력
        int successTime = 0; // 붕대 감기 성공 시간
        
        int attackIdx = 0;

        for(int time = 1; time <= attacks[attacks.length - 1][0]; time++){
            
            // 몬스터 당한 공격 받는 경우
            if(time == attacks[attackIdx][0] && attackIdx < attacks.length){
                currentHealth -= attacks[attackIdx][1]; 
                successTime = 0; 
                attackIdx++;
                
                // 체력이 0이하인 경우
                if (currentHealth <= 0) {
                    return -1; 
                }   
            }else{
                successTime++;
                currentHealth += recovery;
                
                if(successTime == CastingTime){
                    currentHealth += plusRecovery;
                    successTime = 0;
                }
                
                // 최대 체력을 초과한 경우
                if(currentHealth > maxHealth){
                    currentHealth = maxHealth;
                }
            }
        }
        
        answer = currentHealth;
        
        return answer;
    }
}

// t초 동안 1초마다 x체력 회복 + 연속으로 성공하면 추가적으로 y 추가
// 단 최대 체력보다 회복 못함
// 붕대 감는 중 중간에 피격 시 취소 + 연속 추가 보너스 시간도 초기화
// 