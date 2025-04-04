import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] human1 = {1,2,3,4,5};
        int[] human2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] human3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if (answers[i] == human1[i % human1.length]) scores[0]++;
            if (answers[i] == human2[i % human2.length]) scores[1]++;
            if (answers[i] == human3[i % human3.length]) scores[2]++;
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                list.add(i + 1); // 수포자는 1번부터 시작하므로 i + 1
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
// 1번 수포자는 1~5반복
// 2번 2, 1, 2, 3, 2, 4, 2, 5
// 3번 수포자  3, 3, 1, 1, 2, 2, 4, 4, 5, 5