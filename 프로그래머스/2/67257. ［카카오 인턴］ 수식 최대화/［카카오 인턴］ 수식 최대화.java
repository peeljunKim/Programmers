import java.util.*;

class Solution {
    public long solution(String expression) {
        long answer = 0L;
        
        List<Long> nums = new ArrayList<>(); // 숫자
        List<Character> operators = new ArrayList<>(); // 연산자
        
        StringBuilder sb = new StringBuilder(); // 현재 수 누적
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                nums.add(Long.parseLong(sb.toString()));
                sb.setLength(0); 
                operators.add(c);      
            } else {
                sb.append(c);
            }
        }
        // 마지막 숫자 추가
        nums.add(Long.parseLong(sb.toString()));

        // 등장한 연산자 종류를 집합
        Set<Character> opSet = new HashSet<>(operators);
        
        // 연산자 배열 생성(우선순위)
        List<Character> opList = new ArrayList<>(opSet);
        List<List<Character>> permutations = new ArrayList<>();
        makePermutations(opList, new boolean[opList.size()], new ArrayList<>(), permutations);
        
        //  우선순위 조합별로 식을 계산
        for (List<Character> order : permutations) {
            // 원본 리스트 복사본
            List<Long> numsCopy = new ArrayList<>(nums);
            List<Character> opsCopy = new ArrayList<>(operators);

            // 우선순위가 높은 연산자부터 순서대로 처리
            for (char op : order) {
                // opsCopy를 순회하면서 해당 연산자만 처리
                for (int i = 0; i < opsCopy.size(); ) {
                    if (opsCopy.get(i) == op) {
                        long a = numsCopy.get(i);
                        long b = numsCopy.get(i + 1);
                        long res = 0L;

                        // 두 숫자와 연산자를 받아 계산
                        if (op == '+') {
                            res = a + b;
                        } else if (op == '-') {
                            res = a - b;
                        } else { // '*'
                            res = a * b;
                        }
                        
                        numsCopy.set(i, res);
                        numsCopy.remove(i + 1);
                        opsCopy.remove(i);
                        
                        // 제거했으므로 i는 그대로 (다음 인덱스로 자동으로 당겨짐)
                    } else {
                        i++; // 다른 연산자는 건너뛰기
                    }
                }
            }

            long val = Math.abs(numsCopy.get(0));
            if (val > answer) {
                answer = val;
            }
        }
        
        
        return answer;
    }
    
    
    // 연산자 리스트의 모든 배열을 구하는 메서드
    private void makePermutations(List<Character> ops,
                                  boolean[] visited,
                                  List<Character> current,
                                  List<List<Character>> result) {
        // 현재 길이가 연산자 개수와 같으면 배열 완성
        if (current.size() == ops.size()) {
            result.add(new ArrayList<>(current));
            return;
        }

        // 아직 사용하지 않은 연산자를 하나씩 선택해서 배열 생성
        for (int i = 0; i < ops.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                current.add(ops.get(i));
                makePermutations(ops, visited, current, result);
                current.remove(current.size() - 1); // 되돌리기
                visited[i] = false;
            }
        }
    }
}