class Solution {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 1 || num % 2 == -1) answer = "Odd";
        else if (num == 0 ) answer = "Even";
        else answer = "Even";
        return answer;
    }
}