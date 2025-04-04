class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            int temp = 0; // 약수의 개수(공격력)
            for(int j=1; j * j <= i; j++){
                if(i % j == 0){
                    temp++;
                    if (j != i / j) {
                        temp++; 
                    }
                }
            }
            if(temp > limit){
                temp = power;
            }
            answer += temp;
            
        }
        
        
        return answer;
    }
}
// 기사 번호의 약수 개수에 해당하는 공격력을 가진 구매
// 무기의 공격력 1당 1kg의 철
// limit보다 약수 개수가 높으면 limit -1