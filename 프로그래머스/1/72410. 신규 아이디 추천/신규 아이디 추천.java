import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = new_id;
        answer = answer.toLowerCase();

        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        answer = answer.replaceAll("\\.+", ".");
        answer = answer.replaceAll("^\\.+|\\.$", "");

        // 빈 문자열이라면 a로 변경
        if (answer.isEmpty()) {
            answer = "a";
        }

        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        while (answer.length() <= 2) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }
}