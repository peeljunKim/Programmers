class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            long x = numbers[i];

            // 비트 연산으로 확인(짝수)
            if ((x & 1L) == 0L) {       
                answer[i] = x + 1;
            } else { // 홀수
                long y = x + 1;
                long diff = (x ^ y) >> 2;  // 서로 다른 비트들 중 하위 2비트는 제외
                answer[i] = y + diff;
            }
        }

        return answer;
    }
}