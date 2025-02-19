import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> list = new ArrayList<>();
        int leftIndex = -1;
        int rightIndex = -1;
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                leftIndex = i;
                break;
            }
            if (str_list[i].equals("r")) {
                rightIndex = i;
                break;
            }
        }
        
        if (leftIndex != -1) {
            // l이 나오는 경우
            for (int i = 0; i < leftIndex; i++) {
                list.add(str_list[i]);
            }
        } else if (rightIndex != -1) {
            // r이 나오는 경우
            for (int i = rightIndex + 1; i < str_list.length; i++) {
                list.add(str_list[i]);
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}

/*
l이 먼저 나오면 해당 문자열 기준으로 왼쪽에 있는 문자열 담기

r이 먼저 나오면 오른쪽

l, r이 없으면 빈 리스트

*/