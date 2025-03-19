class Solution {
    public int solution(long num) {
        int answer = 0;
        int cnt = 0;
        if(num == 1) return 0;
        
        while(num != 1){
            if(cnt == 500){
                return -1;
            }
            
            if(num % 2 == 0){
                num /= 2;
            }else{
                num = (num * 3) + 1;
            }
            cnt ++;
            // System.out.println(num);
        }
        answer = cnt;
        
        return answer;
    }
}

// 짝수면 /2
//홀수면  *3 +1