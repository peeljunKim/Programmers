import java.util.*;
class Solution {

    /*
    @param book_time [대실 시작 시각, 대실 종료 시각]으로 이루어지 2차원 배열
    return 필요한 최소 객실의 수
    */
    public int solution(String[][] book_time) {
        int maxPossibleTimeAfterCleaning = 24 * 60 + 10; // 1450
        int[] roomUsageChanges = new int[maxPossibleTimeAfterCleaning + 1];

        for (String[] booking : book_time) {
            int startTime = timeToMinutes(booking[0]);
            int endTime = timeToMinutes(booking[1]); // 종료 시간
            int availableTime = endTime + 10; // 청소 후 사용 가능 시간

            // 시작 시간에 방 사용 +1
            roomUsageChanges[startTime]++;

            // 청소 후 사용 가능 시간에 방 사용
            if (availableTime <= maxPossibleTimeAfterCleaning) {
                 roomUsageChanges[availableTime]--;
            }
        }

        int currentRooms = 0;
        int answer = 0;

        for (int i = 0; i <= maxPossibleTimeAfterCleaning; i++) {
            currentRooms += roomUsageChanges[i];
            answer = Math.max(answer, currentRooms);
        }

        return answer;        
    }
    
    // 시간 문자열 int형으로 반환
    private int timeToMinutes(String str) {
        String[] parts = str.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}