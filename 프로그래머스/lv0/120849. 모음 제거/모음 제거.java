class Solution {
    public String solution(String my_string) {
       String answer = "";
		String[] arr = my_string.split("");
		String[] gather = { "a", "e", "i", "o", "u" };
		for (String str : arr) {
			for (int i = 0; i < gather.length; i++) {
				if (gather[i].equals(str)) {
					str = "";
				}
			}
			answer += str;

		}

		return answer;
    }
}