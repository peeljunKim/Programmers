import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
       ArrayList<String> idxList = new ArrayList<String>();
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].contains("ad")) {
			} else {
				idxList.add(strArr[i]);
			}
		}

		String[] answer = new String[idxList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = idxList.get(i);
		}
		return answer;
    }
}