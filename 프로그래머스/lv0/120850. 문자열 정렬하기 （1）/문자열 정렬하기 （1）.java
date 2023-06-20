import java.util.ArrayList;
import java.util.Arrays;
class Solution {
   public int[] solution(String my_string) {
		int count = 0;
		ArrayList<String> sb = new ArrayList<String>();
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57) {
				sb.add(my_string.charAt(i) + "");
				count++;
			}
		}

		int[] answer = new int[count];
		for (int j = 0; j < answer.length; j++) {
			answer[j] = Integer.parseInt(sb.get(j));
		}
		Arrays.sort(answer);
		return answer;
    }
}