class Solution {
    // lottos 내 로또 번호, win_nums 당첨 로또 번호(중복x)
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        int matchCnt = 0;
        int zeroCnt = 0;
        
        for(int num : lottos){ 
            if(num == 0) zeroCnt++;
        }
        
        for(int i=0; i < win_nums.length; i++){
            int num1 = win_nums[i]; // 당첨 로또 번호(해당 번호를 비교해야 됨)
            for(int j=0; j<lottos.length; j++){
                int num2 = lottos[j]; // 내 로또 번호(당첨 번호랑 비교해야 됨)
                if(num1 == num2){
                    matchCnt++;
                }
            }
        }
  
        // 최고순위, 최저 순위
        int max = matchCnt + zeroCnt;
        int min = matchCnt;

        if (max >= 2) {
            answer[0] = 7 - max;
        } else {
            answer[0] = 6;
        }

        if (min >= 2) {
            answer[1] = 7 - min;
        } else {
            answer[1] = 6;
        }
        
        return answer;
    }
}