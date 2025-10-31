class Solution {
    public int solution(int n, int k) {
        int result = 0; 
        String base = Integer.toString(n, k); 
        String[] parts = base.split("0+");

        
        for (String p : parts) {
            if (p.isEmpty()) continue;

            long val = Long.parseLong(p);

            if (isPrime(val)) result++;
        }
        
        return result;
    }
    
    
    
    private boolean isPrime(long x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        long r = (long)Math.sqrt(x);
        
        for (long i = 3; i <= r; i += 2) {
            if (x % i == 0) return false;
        }
        
        return true;
    }
}