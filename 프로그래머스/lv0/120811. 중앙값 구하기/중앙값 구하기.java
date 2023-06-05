import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int idx_center = array.length / 2;
        Arrays.sort(array);
		return array[idx_center];
    }
}