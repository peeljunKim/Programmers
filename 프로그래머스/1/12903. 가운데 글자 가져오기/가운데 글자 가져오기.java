class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if(length % 2 == 1){
            length = (length - 1) / 2;
            answer = String.valueOf(s.charAt(length));
        }else{
            length /= 2;
            answer = s.substring(length -1, length + 1);
        }
        
        return answer;
    }
}