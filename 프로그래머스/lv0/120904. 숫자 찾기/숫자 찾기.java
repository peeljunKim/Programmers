class Solution {
    public int solution(int num, int k) {
        int answer = 0;
		String str = String.valueOf(num);
		String findNum = String.valueOf(k);

		answer = str.indexOf(findNum);
		if (str.indexOf(findNum) != -1) {
			answer++;
		}
		return answer;
    }
}