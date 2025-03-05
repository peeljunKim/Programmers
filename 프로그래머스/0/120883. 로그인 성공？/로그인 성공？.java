import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pw = id_pw[1];
        boolean idMatch = false;
        boolean pwMatch = false;
        
        for(String[] members : db){
            if(members[0].equals(id)){
                idMatch = true;
                if(members[1].equals(pw)){
                // pwMatch = true;
                    return "login";
                }else{
                    return "wrong pw";
                }
            }

        }

        return "fail";
    }
}
// for문을 다 돌리고 비번 검사를 하면 아이디는 맞지만 다른 사람 비번과 동일해서 login이 나올 수 있음


// id_pw가 아이디 비번으로 이루어져 있는 배열
// 아이디가 일치하지 않으면 fail
// 아이디는 맞지만 비번이 틀리면 wrong pw
// 아디, 비번 일치하면 login
// 아이디는 소문자 + 숫자로 구성
// 비번은 숫자로 구성
// 아이디 중복x