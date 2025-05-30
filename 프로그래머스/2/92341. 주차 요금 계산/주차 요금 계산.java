import java.util.*;
class Solution {
    /*
    @param fees 주차 요금을 나타내는 배열
    @param records 자동차들 입/출차 내역
    return 차량 번호가 작은 차량의 요금 순서대로 
    */
    public int[] solution(int[] fees, String[] records) {
        int basicTime = fees[0]; // 기본 주차 시간
        int basicCost = fees[1]; // 기본 주차 요금
        int unitTime = fees[2]; // 추가 요금 단위 시간
        int unitCost = fees[3];; // 단위 시간 당 요금
        // key 차량 번호, value 입장 시간 (출차하면 데이터 삭제)
        Map<String, Integer> inTimeMap = new HashMap<>(); 
        // key 차량 번호, value 주차 총 시간
        Map<String, Integer> totalTimeMap = new HashMap<>();
        
        for(String record : records){
            String[] arr = record.split(" ");
            int inputAndExitTime = changeToMin(arr[0]);
            String carNum = arr[1];
            String description = arr[2];
            
            if (description.equals("IN")) {
                inTimeMap.put(carNum, inputAndExitTime);
            } else { 
                int prevTime = inTimeMap.remove(carNum); 
                int duration = inputAndExitTime - prevTime; // 주차 시간 계산

                totalTimeMap.put(carNum, 
                                 totalTimeMap.getOrDefault(carNum, 0) + duration);
            }
            
        }
        // System.out.println(inTimeMap);
        // System.out.println(totalTimeMap);
        
        int maxTime = changeToMin("23:59");
        for (Map.Entry<String, Integer> entry : inTimeMap.entrySet()) {
            String carNum = entry.getKey();
            int time = entry.getValue();
            int duration = maxTime - time; 
            
            // 총 주차 시간 Map에 누적
             totalTimeMap.put(carNum, 
                              totalTimeMap.getOrDefault(carNum, 0) + duration);
        }
        
        List<String> carNumbers = new ArrayList<>(totalTimeMap.keySet());
        Collections.sort(carNumbers); 
    
        int[] answer = new int[carNumbers.size()];
        for (int i = 0; i < carNumbers.size(); i++) {
            String carNum = carNumbers.get(i);
            int totalTime = totalTimeMap.get(carNum); 
            int totalCost = 0; 
            
            // 기본 요금인 경우
            if (totalTime <= basicTime) { 
                totalCost = basicCost;
            // 기본 시간 초과인 경우
            } else {
                int overTime = totalTime - basicTime;
                // 기본 시간 초과 시간 비용
                int overTimeCost = (int) Math.ceil((double) overTime / unitTime) 
                    * unitCost;
                totalCost = basicCost + overTimeCost;
            }
            answer[i] = totalCost;

        }
        
        return answer;
    }
    
    private int changeToMin(String time){
        String[] arr = time.split(":");
        int hour = Integer.parseInt(arr[0]) * 60;
        return hour + Integer.parseInt(arr[1]);
    }
}