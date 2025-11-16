class Solution {
    public int solution(int a, int b) {
        int g = gcd(a, b); // 최대공약수
        int num = b / g; // 분모
        
        while (num % 2 == 0) {  
            num /= 2;
        }
        
        while (num % 5 == 0) {  
            num /= 5;
        }

        // 2와 5를 모두 제거한 뒤 1이 남으면 유한소수, 아니면 무한소수
        if (num == 1) {
            return 1;   // 유한소수
        } else {
            return 2;   // 무한소수
        }
    }
    
    private int gcd(int x, int y) {
        while (y != 0) {       
            int r = x % y;     
            x = y;             
            y = r;             
        }
    
        return x;              
    }
}