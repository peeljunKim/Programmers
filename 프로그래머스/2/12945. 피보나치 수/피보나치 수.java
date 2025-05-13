class Solution {
    
    public int solution(int n) {
        int answer = 0;
        final int MOD = 1234567;
        int f1 = 0; // f(0) 작은
        int f2 = 1; // f(1) 큰
        int currentNum = 0;
        
        if(n == 0) return f1;
        if(n == 1) return f2;
        
        for(int i=2; i<=n ; i++){
            currentNum = (f1 + f2) % MOD;
            f1 = f2;
            f2 = currentNum;
        }
        
        answer = currentNum;
        
        return currentNum;
    }
}
// current(다음까지) = f1(다음까지) + f0(사라지고)
// f2 = f1 + f0
// f3 = f2 + f1
// f4 = f3 + f2
// f5 = f4 + f3