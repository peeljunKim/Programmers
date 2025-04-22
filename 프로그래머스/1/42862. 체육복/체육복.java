import java.util.*;

// 정답 보고 그대로 함 나중에 그리드 공부하고 다시 해보기
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n + 1]; // 1번부터 n번까지 사용

        // 기본 체육복 1벌씩
        Arrays.fill(students, 1);

        // 도난당한 학생
        for (int l : lost) {
            students[l]--;
        }

        // 여벌 체육복 있는 학생
        for (int r : reserve) {
            students[r]++;
        }

        // 체육복 빌려주기
        for (int i = 1; i <= n; i++) {
            if (students[i] == 0) {
                if (i - 1 >= 1 && students[i - 1] == 2) {
                    students[i]++;
                    students[i - 1]--;
                } else if (i + 1 <= n && students[i + 1] == 2) {
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }

        // 체육 수업 가능한 학생 수 세기
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (students[i] >= 1) {
                count++;
            }
        }

        return count;
    }
}

// 학생들의 번호는 체격 순으로
// 바로 앞번호의 학생이나 바로 뒷번호의 학생에만 빌려줄 수 있음
// 전체 학생의 수 n
// 도난당한 학생의 번호 배열 lost
// 여벌의 체육복을 가지고 있는 학생의 배열 reserve