import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scores = new HashMap<>();
        scores.put('R', 0);
        scores.put('T', 0);
        scores.put('C', 0);
        scores.put('F', 0);
        scores.put('J', 0);
        scores.put('M', 0);
        scores.put('A', 0);
        scores.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            char type1 = survey[i].charAt(0); // 비동의 시 점수 얻는 유형
            char type2 = survey[i].charAt(1); // 동의 시 점수 얻는 유형
            int choice = choices[i];

            if (choice < 4) {
                // 비동의 관련 선택 (1, 2, 3)
                int point = 4 - choice;
                scores.put(type1, scores.get(type1) + point);
            } else if (choice > 4) {
                // 동의 관련 선택 (5, 6, 7)
                int point = choice - 4;
                scores.put(type2, scores.get(type2) + point);
            }
            // choice가 4인 경우는 점수 변동 없음
        }

        String answer = "";
        StringBuilder sb = new StringBuilder();

        // 1번 지표: R vs T
        if (scores.get('R') >= scores.get('T')) {
            sb.append('R');
        } else {
            sb.append('T');
        }

        // 2번 지표: C vs F
        if (scores.get('C') >= scores.get('F')) {
            sb.append('C');
        } else {
            sb.append('F');
        }

        // 3번 지표: J vs M
        if (scores.get('J') >= scores.get('M')) {
            sb.append('J');
        } else {
            sb.append('M');
        }

        // 4번 지표: A vs N
        if (scores.get('A') >= scores.get('N')) {
            sb.append('A');
        } else {
            sb.append('N');
        }
        
        answer = sb.toString();

        return answer;
    }
}
