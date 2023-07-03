class Solution {
    public int solution(int chicken) {
		int answer = 0;
		int rest = 0;
		// chichen == 쿠폰
		while (chicken >= 10) {
			answer += chicken / 10; // 서비스 치킨 수
			rest = chicken % 10; // 서비스 치킨을 시키고 남은 쿠폰
			
			chicken /= 10;
			chicken += rest;
		}
	
		
		
		return answer;
    }
}