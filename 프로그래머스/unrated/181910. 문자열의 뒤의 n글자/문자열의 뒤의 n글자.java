class Solution {
   public String solution(String my_string, int n) {
		String answer = "";
		int num = n;
		for (int i = 0; i < n; i++) {

			answer += my_string.charAt(my_string.length() - num) + "";
			num--;
		}
		return answer;
	}
}