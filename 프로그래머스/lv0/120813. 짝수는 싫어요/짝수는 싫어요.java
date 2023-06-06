import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
       ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				list.add(i);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
    }
}