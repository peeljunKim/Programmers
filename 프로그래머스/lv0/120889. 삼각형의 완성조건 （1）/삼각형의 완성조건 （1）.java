import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int sum = 0;
		Arrays.sort(sides);
		int max = sides[sides.length - 1];

		for (int i = 0; i < sides.length - 1; i++) {
			sum += sides[i];
		}

		return sum <= max ? 2 : 1;
    }
}