class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == ' '){
                idx = 0;
                sb.append(" ");
            }else if(idx % 2 == 0){
                sb.append(Character.toUpperCase(ch));
                idx++;
            }else{
                sb.append(Character.toLowerCase(ch));
                idx++;
            }

        }
        answer = sb.toString();
        return answer;
    }
}
// 짝수번째 대문자, 홀수번은 소문자(단0은 짝수) 
// 인덱스가 아니라 단어 기준