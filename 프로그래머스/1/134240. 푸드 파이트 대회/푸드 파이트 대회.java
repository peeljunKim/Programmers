import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<food.length; i++){
            // System.out.println(i+"번 음식 = " + (food[i]/2));
            int temp = food[i] / 2; // 음식 나누기 갯수(i = 음식 번호)
            if(temp > 0){ // 0이면 for문 작동 안하는데 코드 가독성을 위해 작성함
                for(int j=0; j<temp; j++){
                    sb.append(i);
                }
            }
        }
        // System.out.println(sb);
        String playerA = sb.toString();
        String playerB = sb.reverse().toString();
        
        answer = playerA + "0" + playerB;
        // if(answer.equals("0")){ 정답의 길이가 3 이상인 경우만 입력으로 주어지기 때문에 필요없음
        //     return null;
        // }
        
        
        return answer;
    }
}
// idx = 0은 수옹이가 준비한 물의 양이며, 항상 값은 1
// 대회의 조건을 고려하지 않고 음식을 주문하여 몇 개의 음식은 대회에 사용하지 못하게 되었습니다.

// 선수 A는 왼쪽부터 오른쪽으로, 선수 B는 오른쪽에서 왼쪽
// 중앙에는 물 배치하며 물을 먼저 먹는 선수가 승리
// idx  음식 갯수
// 1        3
// 2        4
// 3        6
//
// 