class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd = getGCD(n, m);
        int lcm = (n * m) / gcd;
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
        // 유클리드 호제법 사용
        private int getGCD(int A, int B) {
            // B가 0이면 A가 최대공약수
            if (B == 0) {
                return A; 
            }
            // gcd(A, B) = (B, r1) ... gcd(x, 0) x가 최대 공약수라고 인지하면 해당 재귀함수를                이해하기 쉬움
            return getGCD(B, A % B); 
        }
}
