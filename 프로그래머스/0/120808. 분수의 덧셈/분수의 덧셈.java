class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = (numer1 * denom2) + (numer2 * denom1); 
        int temp = denom1 * denom2;
        
        for(int i = num-1; i > 1; i--) {
            
            if(num % i == 0 && temp % i == 0) { 
                num /= i;
                temp /= i;
            }
        }
        
        int[] answer = { num, temp };
        return answer;
    }
}

// 1/2 + 3/4 2/4