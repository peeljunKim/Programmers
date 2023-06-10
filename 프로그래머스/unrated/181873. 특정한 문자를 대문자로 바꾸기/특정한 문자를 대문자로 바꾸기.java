class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";

		for (int i = 0; i < my_string.length(); i++) {
			String str = my_string.substring(i, i + 1);
			if (str.equals(alp)) {
				String str2 = str.toUpperCase();
				str = str2;
			}
			answer += str;
		}
		return answer;
    }
}