class Solution {
    public int solution(int[] box, int n) {
        int q= box[0] / n;
		int w = box[1] / n;
		int e= box[2] / n;
		return q * w * e;
    }
}