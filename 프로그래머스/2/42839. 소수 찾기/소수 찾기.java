import java.util.*;
class Solution {
    Set<Integer> set = new HashSet<>(); // 조합한 숫자
    boolean[] visited;
    
    /*
    @param numbers 각 종이 조각 숫자 문자열
    return 종이 조각으로 만들 수 있는 소수 개수
    */
    public int solution(String numbers) {
        int answer = 0;
        int n = numbers.length();
        visited = new boolean[n];
        
        for (int i = 1; i <= n; i++) {
            dfs("", numbers, i);
        }
        

        for (int number : set) {
            if (isMatch(number)) {
                answer++;
            }
        }
      
        return answer;
    }
    
    /*
    @param currentNumber 만들어진 숫자 문자열
    @param numbers 원본 숫자 문자열
    @param length 만든 숫자 길이
    */
    private void dfs(String currentNumber, String numbers, int length) {
        if (currentNumber.length() == length) {
            if (!currentNumber.isEmpty()) {
                set.add(Integer.parseInt(currentNumber));
            }
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true; 
                // 현재 숫자 + i번째 새로운 조합 생성
                // System.out.println("current = " + currentNumber);
                dfs(currentNumber + numbers.charAt(i), numbers, length);
                visited[i] = false; 
            }
        }
    }
    
        
    // 소수 판별 메소드
    private boolean isMatch(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false; 
            }
        }

        return true; 
    }
}