class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double total = 0;
        for(int num : arr){
            total += num;
        }
        
        answer = total / arr.length;
        
        return answer;
    }
}