import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] arr1, int[] arr2) {
                // col-1 번째 값을 기준(오름차순)
                if (arr1[col - 1] != arr2[col - 1]) {
                    return Integer.compare(arr1[col - 1], arr2[col - 1]);
                }
                // col-1 번째 값이 동일하면 내림차순(0 인덱스)
                return Integer.compare(arr2[0], arr1[0]); // arr2[0] - arr1[0]
            }
        });
        
        for (int i = row_begin - 1; i <= row_end - 1; i++) {
            int temp = 0;

            for (int value : data[i]) {
                temp += (value % (i + 1));
            }
            
            answer ^= temp;
        }
        
        return answer;
    }
}