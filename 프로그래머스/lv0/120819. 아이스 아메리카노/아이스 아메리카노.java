class Solution {
    public int[] solution(int money) {
        int aa = money / 5500;
		int cash = money - 5500 * aa;
		int[] answer = { aa, cash };

		return answer;
    }
}