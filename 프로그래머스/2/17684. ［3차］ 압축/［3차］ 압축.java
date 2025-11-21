import java.util.*;

class Solution {
    public int[] solution(String msg) {
        // key: 문자열 value: 인덱스 번호
        Map<String, Integer> dict = new HashMap<>();

        int dictIndex = 1;
        for (char c = 'A'; c <= 'Z'; c++) {
            dict.put(String.valueOf(c), dictIndex++);
        }

        List<Integer> output = new ArrayList<>();
        int i = 0; // 현재 읽는 위치 인덱스

        // 전체 문자열을 순회
        while (i < msg.length()) {
            String w = "";  // 현재 사전에 있는 가장 긴 문자열
            int j = i;

            // 존재하는 가장 긴 문자열 찾기
            while (j < msg.length()) {
                String next = msg.substring(i, j + 1);

                if (dict.containsKey(next)) {
                    w = next;
                    j++;
                } else {
                    break;
                }
            }

            output.add(dict.get(w));

            // 다음 글자가 존재하면 (w + c)를 사전에 등록
            // - j는 현재 w 다음 글자의 위치
            if (j < msg.length()) {
                String wc = msg.substring(i, j + 1); // w + c
                if (!dict.containsKey(wc)) {
                    dict.put(wc, dictIndex++);
                }
            }
            i += w.length();
        }

        int[] answer = new int[output.size()];
        for (int k = 0; k < output.size(); k++) {
            answer[k] = output.get(k);
        }

        return answer;
    }
}
