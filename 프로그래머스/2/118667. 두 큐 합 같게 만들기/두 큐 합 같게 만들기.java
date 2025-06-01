class Solution {
    // return 두 큐의 원소의 합이 같아질때 까지 최소 몇 번의 작업 반환, 못하면 -1 반환
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        int n = queue1.length;
        long sum1 = 0; // 큐1의 합산 초기값
        long sum2 = 0; // 큐2의 합산 초기값
        
        // 두 큐 합산
        int[] combinedQueue = new int[2 * n];
        for (int i = 0; i < n; i++) {
            combinedQueue[i] = queue1[i];
            sum1 += queue1[i]; 
        }
        for (int i = 0; i < n; i++) {
            combinedQueue[n + i] = queue2[i];
            sum2 += queue2[i]; 
        }
        
        long totalSum = sum1 + sum2;
        
        if (totalSum % 2 != 0) {
            return -1;
        }
        
        long targetSum = totalSum / 2; // 각 큐가 가져야 할 목표 합계
        
        int p1 = 0; // q1 인덱스
        int p2 = n; // q2 인덱스
        
        int limit = 2 * (n + n); // 작업 횟수 최대값
        
        while (sum1 != targetSum) {
            // 최대 작업 횟수를 초과하는 경우
            if (answer >= limit) {
                return -1;
            }

            if (sum1 < targetSum) {
                // sum1이 목표보다 작으면 queue2에서 queue1으로 원소를 이동
                // queue2의 현재 시작 위치(p2)에 있는 원소
                int elementToMove = combinedQueue[p2];
                sum1 += elementToMove; // sum1에 추가
                sum2 -= elementToMove; // sum2에서 제거
                p2 = (p2 + 1) % (2 * n); // queue2의 시작 포인터를 다음으로 이동
            } else { 
                int elementToMove = combinedQueue[p1];
                sum1 -= elementToMove; // sum1에서 제거
                sum2 += elementToMove; // sum2에 추가
                p1 = (p1 + 1) % (2 * n); // queue1의 시작 포인터를 다음으로 이동
            }
            answer++; 
        }
        
        
        return answer;
    }
}
// pop, insert 두 작업이 1회 작업