import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
		while (n != 1) {
			if (n % 2 == 1) {
				list.add(n);
				n = n * 3 + 1;
			} else {
				list.add(n);
				n /= 2;
			}
		}

		int[] answer = new int[list.size() + 1];
		Arrays.fill(answer, 1);
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
    }
}