class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            if(ch >= 65 && ch <= 90){ // 대문자
                char temp = (char) (ch + n);
                if(temp > 90){
                    temp = (char) (temp % 90 + 64);
                    sb.append(temp);
                }else {
                    sb.append(temp);
                }
                
                
            }else if(ch >= 97 && ch <= 122){ // 소문자
                char temp = (char) (ch + n);
                if(temp > 122){
                    temp = (char) (temp % 122 + 96);
                    sb.append(temp);
                }else {
                    sb.append(temp);
                }
                
                
            }else if(ch == ' '){
                sb.append(" ");
            }
        }
        // System.out.print(sb.toString());
        answer = sb.toString();
        return answer;
    }
}
// 아스키 코드 
// 65 ~ 90(A ~ Z)
// 97 ~ 122(a ~ z)