import java.util.*;
class Solution {
    /**
    @param elements 원형 수열의 모든 원소
    return 연속 부분 수열 합으로 만들 수 있는 수의 개수
    **/
    public int solution(int[] elements) {
        int answer = 0;
        // Arrays.sort(elements);
        int n = elements.length;
        int[] doubleElements = new int[2*n]; // 원형 수열
        for (int i = 0; i < n; i++) {
            doubleElements[i] = elements[i];
            doubleElements[i + n] = elements[i];
        }
        
        // 수열 합 집합
        Set<Integer> set = new HashSet<>();
        
        // 수열의 길이
        for (int i = 1; i <= n; i++) {
            
            // 수열 합
            int sum = 0;
            
            // 수열의 길이에 맞게 합
            for (int j = 0; j < i; j++) {
                sum += doubleElements[j];
            }
            
            set.add(sum);

            for (int start = 1; start < n; start++) {
           
                sum = sum - doubleElements[start - 1] + doubleElements[start + i - 1];
                set.add(sum);
            }
        }

        answer = set.size();
        return answer;
    }
}
// [7, 9, 1, 1, 4]