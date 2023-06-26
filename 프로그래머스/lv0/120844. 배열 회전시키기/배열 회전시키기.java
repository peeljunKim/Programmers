class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

		if (direction.equals("right")) {
			for (int i = 0; i < answer.length; i++) {
				if (i != 0) {
					answer[i] = numbers[i - 1];
				} else if (i == 0) {
					answer[i] = numbers[numbers.length - 1];
				}

			}
		} else if (direction.equals("left")) {
			for (int i = 0; i < answer.length; i++) {
				if (i != numbers.length - 1) {
					answer[i] = numbers[i + 1];
				} else if (i == numbers.length - 1) {
					answer[i] = numbers[0];
				}

			}
		}
		return answer;
    }
}