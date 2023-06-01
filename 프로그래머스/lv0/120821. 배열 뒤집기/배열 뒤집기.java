class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
		int len = num_list.length;
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[len-1];
			len--;
		}
		return answer;
    }
}