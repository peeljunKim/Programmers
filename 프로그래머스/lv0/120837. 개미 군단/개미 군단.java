class Solution {
    public int solution(int hp) {
        int q = hp % 5; // 장군개미 빼고 나머지 공격력
		
		int a = hp / 5; // 장군 개미
		
		
		int b = 0; // 병정개미
		int c = 0; // 일개미
		
		if (q != 0) {
			b = q / 3;
		}
		
		c = q % 3 / 1;
		return a + b + c;
    }
}