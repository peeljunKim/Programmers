class Solution {
    public String solution(String phone_number) {
        String backNumber = phone_number.substring(phone_number.length()-4);
        String answer = "";
        int starCnt = phone_number.length() - 4;
        for(int i=0; i<starCnt; i++){
            answer += "*";
        }
        
        return answer + backNumber;
    }
}