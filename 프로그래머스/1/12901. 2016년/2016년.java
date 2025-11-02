class Solution {
    public String solution(int a, int b) {
        // 1월, 2월(29), 3월, 4월, 5월, 6월, 7월, 8월, 9월, 10월, 11월, 12월
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int totalDays = 0;
        
        for (int i = 0; i < a - 1; i++) {
            totalDays += daysInMonth[i];
        }
        
        totalDays += (b - 1);
        
        int initialDayIndex = 5; // 금요일
        int finalDayIndex = (totalDays + initialDayIndex) % 7;

        return daysOfWeek[finalDayIndex];
        
    }
}