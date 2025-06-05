class Solution {
    /*
    @param players 시간대별 게임 이용자 수(i ~ i+1 시간)
    @param m 서버 한 대당 최대 이용자의 수
    @param k 서버 한 대당 운영 가능한 시간
    */
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int currentServer = 0; // 지금 가용 가능한 서버
        
        int [] addServers = new int[24]; // 시간 당 추가된 서버 수 
        
        for(int i=0; i<players.length; i++){
            int player = players[i]; // 시간 당 게임 이용자 수
            int requireServer = player / m; // 현재 시간에 필요한 서버 수
            
            int expiryHour = i - k; // 이전에 개설된 서버가 만료되는 시간
            if (expiryHour >= 0) {
                currentServer -= addServers[expiryHour];
            }
            
            int needServer = requireServer - currentServer; // 현재 부족한 서버 개수
            if (needServer > 0) { // 서버 증강 필요한 경우
                addServers[i] = needServer;
                answer += needServer;
                currentServer += needServer;
            } else {// 서버 증강이 필요하지 않는 경우
                addServers[i] = 0;
            }
        }
        
        return answer;
    }
}