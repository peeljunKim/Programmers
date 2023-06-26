class Solution {
    public String solution(int age) {
        StringBuffer sb = new StringBuffer();
		while (age > 0) {
			int num = age % 10;
			char c = (char) (num + 'a');
			sb.insert(0, c);
			age /= 10;
		}
		return sb.toString();
    }
}