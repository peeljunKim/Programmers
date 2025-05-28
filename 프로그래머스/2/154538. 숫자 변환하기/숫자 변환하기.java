import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = -1;
        // int [] arr = new int [3];
        
        if (x == y) {
            return 0;
        }
        
        Queue<int[]> queue = new LinkedList<>(); // [현재 숫자, 연산 횟수]
        Set<Integer> visited = new HashSet<>(); // 중복 확인을 위해 생성
        queue.offer(new int[]{x, 0});
        visited.add(x);
        
        while(!queue.isEmpty()){
            int[] arr = queue.poll();
            // System.out.println("queue = " + Arrays.toString(arr));
            int currentNum = arr[0];
            int currentCnt = arr[1];
            
            int [] nextNums = {currentNum + n, currentNum * 2, currentNum * 3};
            
            for (int nextNum : nextNums) {
                if (nextNum == y) { // 목표 y 값 확인
                    return currentCnt + 1;
                }

                // y보다 작거나 중복인지 확인
                if (nextNum < y && !visited.contains(nextNum)) {
                    queue.offer(new int[]{nextNum, currentCnt + 1});
                    visited.add(nextNum);
                }
            }
        }
        
        return answer;
    }
}