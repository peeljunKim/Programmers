import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;
		ArrayList<String> idxList = new ArrayList<String>();
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].contains("ad")) {
			} else {
				idxList.add(count, strArr[i]);
				count++;
			}
		}

		String[] answer = new String[count];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = idxList.get(i);
		}
		return answer;
    }
}