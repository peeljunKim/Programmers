class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long totalMoney = 0;
        for(int i=1; i<=count; i++){
            totalMoney += (price * i);
        }
        answer = totalMoney - money;
        if(answer < 0){
            answer = 0;
        }
        

        return answer;
    }
}