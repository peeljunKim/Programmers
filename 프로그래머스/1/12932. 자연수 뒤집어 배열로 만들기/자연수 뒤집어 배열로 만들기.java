class Solution {
    public int[] solution(long n) {
        // int length = (int) (Math.log10(n) + 1);
        String[] str = String.valueOf(n).split("");
        int[] answer = new int [str.length];
        int length = answer.length;
        
        for(int i=0; i < answer.length; i++){
            length--;
            answer[i] = Integer.parseInt(str[length]);
            
        }
        
        
        
        return answer;
    }
}