import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>(); // 컨베이어 벨트
        int idx = 0;
        int box = 1; // 메인 벨트에서 나올 상자
        
        while (idx < order.length) {
            int requiredBox = order[idx]; // 처리해야 되는 상자

            // 보조 컨베이어 벨트 확인
            if (!stack.isEmpty() && stack.peek() == requiredBox) {
                stack.pop(); 
                answer++; 
                idx++; 
                continue; 
            }

            // 메인 컨베이어 벨트에서 원하는 상자가 나올 때까지 상자를 보조 벨트로 이동
            if (box <= requiredBox) {
                while (box < requiredBox) {
                    // 원하는 상자가 아니므로 보조 벨트로 옮김
                    stack.push(box);
                    box++; 
                }

                // 메인 벨트에서 원하는 상자가 나오는 경우
                if (box == requiredBox) {
                    answer++; 
                    box++; 
                    idx++; 
                    continue; 
                }
                
            }

            // 보조 벨트에도 없고, 메인 벨트에서도 현재 나올 수 없는 경우
            break;
        }
        
        return answer;
    }
}