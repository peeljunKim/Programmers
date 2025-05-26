import java.util.*;
class Solution {
    /*
    @param scoville 음식 스코빌 지수 배열
    @param k 만들고 싶은 스코빌 지수
    return 모든 음식을 k이상으로 만들기 위한 최소 횟수, 못 만들면 -1 반환
    */
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int temp: scoville){
            heap.add(temp);
        }
        
        while(heap.peek() < K){
            if(heap.size() < 2) break;
            
            int min = heap.poll();
            int temp = heap.poll() * 2;
            heap.add(min + temp);
            answer++;
        }
        
        // System.out.println(heap);
        
        if(heap.peek() < K) return -1;
        
        return answer;
    }
}

// scoville의 길이는 2 이상 1,000,000 이하입니다.
// K는 0 이상 1,000,000,000 이하입니다.
// scoville의 원소는 각각 0 이상 1,000,000 이하입니다.