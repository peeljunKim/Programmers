import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answerList = new ArrayList<String>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answerList.add(todo_list[i]);
            }
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);
        return answer;
    }
}