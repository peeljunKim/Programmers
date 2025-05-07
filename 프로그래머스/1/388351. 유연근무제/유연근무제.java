import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        boolean[] persons = new boolean[schedules.length]; // 상품 받을 직원들 구분
        Arrays.fill(persons, true); // 초기값 true로 변환
        
        for(int i=0; i<timelogs.length; i++){ // 직원 번호
            
            // 이걸 왜 하는건지 모르겠음
            int goalHour = schedules[i] / 100;
            int goalMin = schedules[i] % 100;
            int goalToalTime = goalHour * 60 + goalMin;

            
            // 출근 희망 시간에서 애초에 10 더함 (출근 인정시간)
            int goalTime = goalToalTime + 10; 
            
            for(int j=0; j<timelogs[i].length; j++){ // 요일 번호
                int day = (startday -1 + j) % 7 + 1; // 요일 
                int actualHour = timelogs[i][j] / 100;
                int actualMinute = timelogs[i][j] % 100;
                int actualTotalMinutes = actualHour * 60 + actualMinute;
                
                if(day == 6 || day == 7){ // 주말 (이걸 건들 필요가 있나??)
                    // System.out.print("출근 시간 = " + timelogs[i][j]);
                    // System.out.println(", day = " +day + "\n주말이다~");
                }else{
                    if(goalTime < actualTotalMinutes){
                        persons[i] = false;
                        break;
                    }
                }
            }
        }
        
        // System.out.println(Arrays.toString(persons));
        for(boolean bool : persons){
            if(bool){
                answer++;
            }
        }
        
        
        return answer;
    }
}

// 출근 희망 시간 + 10분까지 인정
// 주말의 출근 시간은 영향 x startday + j가 6 or 7이면 영향 x
// 출근 희망 시간 schedules
// 직원들 일주일간 출근 시간 timelogs
// 이벤트 시작 요일 startday
