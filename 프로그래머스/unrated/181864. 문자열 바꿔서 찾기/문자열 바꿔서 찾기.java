class Solution {
    public int solution(String myString, String pat) {
        String str = null;
		for (int i = 0; i < myString.length(); i++) {
			char ch = myString.charAt(i);
			if (ch == 65) {
				ch += 1;
			} else {
				ch -= 1;
			}
			str += ch;
		}

		return str.contains(pat) ? 1 : 0;
    }
}