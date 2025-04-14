class Solution {
    public int solution(String s) {
        int answer = 0;
        int idx = 0;
             
        while(idx < s.length()){
            char compareChar = s.charAt(idx);
            int fristCharCnt = 0;
            int otherCharCnt = 0;
            
            while(idx < s.length()){
                if(s.charAt(idx) == compareChar){
                    fristCharCnt++;
                    // System.out.println("fristCharCnt = " + s.charAt(idx));
                    // System.out.println("fristCharCnt = " + fristCharCnt);
                }else{
                    otherCharCnt++;
                    // System.out.println("otherCharCnt  = " + s.charAt(idx));
                    // System.out.println("otherCharCnt = " + otherCharCnt);
                }
                
                if(fristCharCnt == otherCharCnt){
                    answer++;
                    idx++;
                    // System.out.println("idx = " + idx);
                    // System.out.println("fristCharCnt = " + fristCharCnt);
                    // System.out.println("otherCharCnt = " + otherCharCnt);
                    break;
                }
                idx++;
            }
            
            if(idx >= s.length() && fristCharCnt != otherCharCnt){
                answer++;
                // System.out.println("idx = " + idx);
                // System.out.println("otherCharCnt = " + otherCharCnt);
                // System.out.println("fristCharCnt = " + fristCharCnt);
                break;
            }
             
        }
        
        return answer;
    }
}
// 첫글자 x
// 첫글자랑 똑같은 경우(a), 아닌 경우(b) 각각 횟수를 셈
// 처음으로 두 경우가 같은 경우 멈추고 지금까지 읽은 문자열을 분리
// 