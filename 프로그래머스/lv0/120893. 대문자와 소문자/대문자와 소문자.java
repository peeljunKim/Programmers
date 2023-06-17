class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
		for (int i = 0; i < my_string.length(); i++) {
			char ch = my_string.charAt(i);
			if (ch >= 65 && ch <= 90) {
				String str = my_string.charAt(i) + "";
				sb.append(str.toLowerCase());
			}else if (ch >= 97 && ch <= 122) {
				String str = my_string.charAt(i) + "";
				sb.append(str.toUpperCase());
			}
		}
		return sb.toString();
    }
}