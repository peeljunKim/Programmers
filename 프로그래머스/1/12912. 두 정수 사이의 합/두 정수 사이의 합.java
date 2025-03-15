class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        
        if(a == b){
            return a;
        }
        
        for(long i=min; i<=max; i++){
            answer += i;
        }
            
        
        return answer;
    }
}