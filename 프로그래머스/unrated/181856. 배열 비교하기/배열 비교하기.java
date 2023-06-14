class Solution {
    public int solution(int[] arr1, int[] arr2) {
int answer = 0;
		int arr1_sum = 0;
		int arr2_sum = 0;

		for (int n1 : arr1) {
			arr1_sum += n1;
		}
		for (int n2 : arr2) {
			arr2_sum += n2;
		}

		if (arr1.length > arr2.length) {
			answer = 1;
		} else if (arr1.length < arr2.length) {
			answer = -1;
		} else if (arr1.length == arr2.length) {
			if (arr1_sum < arr2_sum) {
				answer = -1;
			} else if (arr1_sum > arr2_sum) {
				answer = 1;
			} else if (arr1_sum == arr2_sum) {
				answer = 0;
			}
		}

		return answer;
    }
}