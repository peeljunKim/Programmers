class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int temp = 0;
        for (int i = 0; i < section.length; i++) {
            if (section[i] > temp) {
                answer++; 
                temp = section[i] + m - 1; // 현재 구역을 칠한 후의 끝 위치
            }
        }
        return answer;
    }
}