import java.util.*;
class Solution {
    /*
    @param bridge_length 다리에 올라갈 수 있는 트럭 수
    @param weight 다리가 견딜 수 있는 무게
    @param truck_weights 트럭 별 무게
    return 모든 트럭이 다리를 건너는 최소 초
    */
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int n = truck_weights.length;
        int sum = 0; // 다리에 있는 트럭 총 무게
        
        Queue<Integer> waitTruchs = new LinkedList<>(); // 대기 트럭
        Queue<int[]> moveTruchs = new LinkedList<>(); // 다리를 건너고 있는 트럭
        for(int num : truck_weights){
            waitTruchs.add(num);
        }
        
        while(!waitTruchs.isEmpty() || !moveTruchs.isEmpty()){
            answer++;
            
            // 다리를 건너는 경우
            if (!moveTruchs.isEmpty() && moveTruchs.peek()[1] == answer) {
                int[] finishTruck = moveTruchs.poll();
                sum -= finishTruck[0];
            }
            
            // 대기 중인 트럭이 다리에 진입할 수 있는지 확인
            if (!waitTruchs.isEmpty()) {
                int nextTruckWeight = waitTruchs.peek(); 

                // 다리에 새로운 트럭이 진입할 수 있는 검사
                if (moveTruchs.size() < bridge_length && 
                    sum + nextTruckWeight <= weight) {
                    
                    int frontTruckWeight = waitTruchs.poll();
                    // {트럭 무게, 다리를 완전히 건너게 될 시간(현재 시간 + 다리 길이)} 
                    moveTruchs.offer(new int[]{frontTruckWeight, 
                                               answer + bridge_length});
                    // System.out.println(Arrays.toString(moveTruchs.peek()));
                    sum += frontTruckWeight; 
                }
            }
        }
                
        
        return answer;
    }
    
}

// bridge_length이 왜 다리 시작부터 끝까지 이동하는 시간인지 모르겠음