import java.util.*;
class Solution {
    /**
    @param n 사람의 수
    @param words 사람들이 말한 단어들
    return 가장 먼저 탈락하는 사람 [번호, 차례]
    **/
    public int[] solution(int n, String[] words) {
        int[] answer = new int [2];
        Set<String> usedWords = new HashSet<>(); // 사용한 단어
        char lastChar = ' ';
        
        for(int i=0; i<words.length; i++){
            String currentWord = words[i];
            int playerNum = (i % n) + 1; // 번호
            int turnNum = (i / n) + 1; // 차례
            
            // 앞에서 이미 단어를 사용한 경우
            if (usedWords.contains(currentWord)) {
                return new int[]{playerNum, turnNum};
            }
            
            // 다음 사람이 끝말잇기를 실패한 경우
            if (i > 0) {
                if (currentWord.charAt(0) != lastChar) {
                    return new int[]{playerNum, turnNum};
                }
            }
            usedWords.add(currentWord);
            lastChar = currentWord.charAt(currentWord.length() - 1);
        }
        
        return answer;
    }
}

/**
1. 순서대로 말함
2. 한 글자 x
**/