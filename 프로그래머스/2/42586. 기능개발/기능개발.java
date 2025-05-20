import java.util.*;
class Solution {
    /**
    @param 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열
    @param 각 기능이 개발 속도가 적힌 정수 배열
    **/
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        Stack<Integer> stack = new Stack<>(); // 스택/큐 문제라서 스택으로 풀었는데 굳이? 라는 느낌 받음
        
        int[] daysRequired = new int[speeds.length]; // 각 기능에 필요한 개발 일수
        for (int i = 0; i < speeds.length; i++) {
            int remaining = 100 - progresses[i];
            daysRequired[i] = (remaining + speeds[i] - 1) / speeds[i];
        }
        // System.out.println(Arrays.toString(daysRequired));
        
        int deadline = daysRequired[0]; // 기본 값: 제일 빨리 배포하는 날짜
        int cnt = 1; // 배포 가능한 기능 수
        for(int i=1; i<daysRequired.length; i++){
            if(daysRequired[i] <= deadline){
                cnt++;
            } else{
                stack.add(cnt);
                deadline = daysRequired[i];
                cnt = 1;
            }
        }
        stack.add(cnt);
        // System.out.println("cnt = " + cnt);
        // System.out.println("stack = " + stack);
        
        answer = new int[stack.size()];
        for(int i=0; i<stack.size(); i++){
            answer[i] = stack.get(i);
        }
        
        return answer;
    }
}

// 진도가 100퍼일 때 서비스에 반영
// 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포