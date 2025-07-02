class Solution {
    public int solution(int n) {
        int answer = n + 1;
        int count = Integer.bitCount(n);
        
        while (true) {
            // 2진수에서 '의 개수를 계산
            int num = Integer.bitCount(answer);

            if (num == count) {
                return answer; 
            }

            answer++;
        }
    }
}