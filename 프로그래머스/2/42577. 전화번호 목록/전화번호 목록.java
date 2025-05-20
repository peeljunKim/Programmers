import java.util.*;
class Solution {
    /**
    @param phone_book 전화번호 배열
    **/
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> set = new HashSet<>();
        for(String str : phone_book){
            set.add(str);
        }
        
        for(String phoneNumber : phone_book){
            for (int i = 1; i < phoneNumber.length(); i++) {
                String temp = phoneNumber.substring(0, i);

                if (set.contains(temp)) {
                    return false;
                }
            }
        }
        
        // if(phone_book[i + 1].startsWith(str, 0)) return false;
            
                
        return answer;
    }
}
// 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true
// 번호 중복 x
// 번호 길이 1~20
// phone_book 1 ~ 1000000
// 효율성 테스트