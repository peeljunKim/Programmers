class Solution {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];

        for(int i=0; i<answer.length; i++){
            answer[i] = -1; // -1로 초기화
        }
        
        
        for(int i=1; i<answer.length; i++){ // 여기서 앞에 글자 체크 로직
            char ch = s.charAt(i);
            for(int j = i-1; j >= 0; j--){
                char ch_j = s.charAt(j);
                // System.out.println("j = " + j + " ch = " + ch_j);
                if(ch == ch_j){
                    // System.out.println("ch = " + ch + " ch_j = " + ch_j);
                    // System.out.println(i-j);
                    answer[i] = i-j;
                    break;
                }
                
            }
        }
        
        return answer;
    }
}

// ??