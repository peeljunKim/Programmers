class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt_p = 0;
        int cnt_y = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == 'p' || ch == 'P'){
                cnt_p++;
            }else if(ch == 'y'|| ch == 'Y'){
                cnt_y++;
            }
        }
        
        if(cnt_p != cnt_y){
            return false;
        }else if(cnt_p == 0 && cnt_y ==0){
            return true;
        }
        
        return answer;
    }
}

// p과 y에 갯수가 같으면 true