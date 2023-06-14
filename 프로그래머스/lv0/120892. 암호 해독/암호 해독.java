class Solution {
    public String solution(String cipher, int code) {
        StringBuffer sb = new StringBuffer();
		int n = code - 1;
		for (int i = n; i < cipher.length(); i += code) {
			sb.append(cipher.charAt(i));
		}

		return sb.toString();
    }
}