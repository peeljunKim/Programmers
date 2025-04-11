class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 2;
        
        while (temp <= n) {
            if (isthtn(temp)) {
                answer++; 
            }
            temp++;
        }
         
        return answer;
    }
    public static boolean isthtn(int number) { 
        int temp = 2;

        while (temp * temp <= number) {
            if (number % temp == 0) {
                return false; 
            }
            temp++; 
        }
        
        return true; 
    }
}
