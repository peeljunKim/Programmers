class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int idx = 1;
        
        for (int i = 1; i <= n; i++) {
            sum += i; 
            
            // 처음부터 숫자를 더하고 n 보다 커지면 1부터 sum에서 빼는 식
            while (sum > n) {
                sum -= idx; 
                idx++; 
            }

            if (sum == n) {
                answer++; 
            }
            
        }
        
        return answer;
    }
}