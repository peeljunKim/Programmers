class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean isFirstChar = true;
        
        for(int i=0; i<s.length(); i++){
            char lowerChar = s.charAt(i);
            
            if(lowerChar == ' '){
                sb.append(lowerChar);
                isFirstChar = true;
            } else{
                 if (isFirstChar) {
                    // 새로운 단어의 시작인 경우
                    sb.append(Character.toUpperCase(lowerChar));
                    isFirstChar = false;
                } else {
                    // 새로운 단어의 시작이 아닌 경우.
                    sb.append(Character.toLowerCase(lowerChar));
                    isFirstChar = false;
                }
            }
            
        }
        
//         int idx= 0; // 공백 찾는 인덱스
        
//         // 처음 문자 대문자로 변환
//         sb.setCharAt(idx, Character.toUpperCase(sb.charAt(idx)));
        
//         while(idx < s.length()){
//             int temp = s.indexOf(' ', idx);
            
//             if(temp == -1){
//                 break;
//             }
            
//             idx = temp + 1; // 공백 다음 문자
//             System.out.println(idx);
//             // char lowerChar = sb.charAt(idx);
//             // char upperChar = Character.toUpperCase(lowerChar);
//             // sb.setCharAt(idx, upperChar);    
//         }
//         answer = sb.toString();

        answer = sb.toString();
        return answer;
    }
}