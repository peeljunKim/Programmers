class Solution {
    public String solution(String myString) {
        String answer = "";
		String[] str = myString.split("");
		for (int i = 0; i < myString.length(); i++) {
			String str1 = str[i].toLowerCase();
			if (myString.charAt(i) == 97 || myString.charAt(i) == 65) {
				str1 = str[i].toUpperCase();
			}
			answer += str1;
		}
		return answer;
    }
}