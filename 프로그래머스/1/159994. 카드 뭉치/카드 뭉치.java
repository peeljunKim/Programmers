class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int num1 = 0;
        int num2 = 0;
        
        for (String str : goal) {
            if (num1 < cards1.length && cards1[num1].equals(str)) {
                num1++; 
            } else if (num2 < cards2.length && cards2[num2].equals(str)) {
                num2++; 
            } else {
                return "No"; 
            }
        }
        
        return answer;
    }
}