class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
		for (int n : array) {
			if (height < n) {
				answer++;
			}
		}
		return answer;
    }
}