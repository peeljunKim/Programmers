import java.util.*;
class Solution {
    /**
    @param priorities 실행 대기 중인 프로세스 중요도가 담긴 배열
    @param location 몇 번째로 실행되는지 알고 싶은 프로세스 처음 위치
    **/
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // key 우선순위, value 원래 인덱스
        Queue<Map.Entry<Integer, Integer>> queue = new LinkedList<>();
        int[] priorityCnt = new int [10]; // 1~9 우선순위를 가진 프로세스 개수
        
        for(int i=0; i<priorities.length; i++){
            int priority = priorities[i];
            queue.add(new AbstractMap.SimpleEntry<>(priority, i)); // 인텔리제이 도움 받아서 작성함 왜 이렇게 작성해야 되는지 모름
            priorityCnt[priority]++;
        }
        
        System.out.println("queue = " + queue);
        System.out.println("priorityCnt = " + Arrays.toString(priorityCnt));
        // System.out.println("peek = " + queue.peek());
        // System.out.println("pool = " + queue.poll());
        
        while(!queue.isEmpty()){
            Map.Entry<Integer, Integer> frontOfQueue = queue.poll();
            int process = frontOfQueue.getKey(); // 1~9
            int processIdx = frontOfQueue.getValue(); // 0~99
            
            boolean isHigherPriority = false;
            
            // 더 높은 프로세스가 있는 경우
            for(int i=process + 1; i<=9 ; i++){
                if (priorityCnt[i] > 0) { // 더 높은 우선순위의 프로세스가 있음
                    isHigherPriority = true; 
                    break;
                }
            }
            // 더 높은 우선순위의 프로세스가 있는 경우, 큐의 맨 뒤에 추가
            if (isHigherPriority) {
                queue.add(frontOfQueue);
            } else {// 더 높은 우선순위 프로세스가 없는 경우
                answer++; 
                priorityCnt[process]--; 

                if (processIdx == location) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}