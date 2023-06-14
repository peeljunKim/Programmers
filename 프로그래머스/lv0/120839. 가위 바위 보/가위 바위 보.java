class Solution {
    public String solution(String rsp) {
        StringBuffer sb = new StringBuffer();

		String[] arr = rsp.split("");

		for (String str : arr) {
			if (str.equals("2")) {
				str = "0";
				sb.append(str);
			} else if (str.equals("0")) {
				str = "5";
				sb.append(str);
			} else {
				str = "2";
				sb.append(str);
			}
		}

		return sb.toString();
    }
}