class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer;
		int count = 0;
		int idx = 0;
		for (int num : numlist) {
			if (num % n == 0) {
				count++;
			}
		}
		answer = new int[count];

		for (int num : numlist) {
			if (num % n == 0) {
				answer[idx] = num;
				idx++;
			}
		}
		return answer;
    }
}