import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr=s.split(" ");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("Z")){
                // 숫자를 제거해도 되지만 0으로 치환함 
                // 이유: 원소들의 합을 구하기 때문에
                arr[i-1] = "0"; 
                arr[i] = "0";
            }
        }
        
        for(String str : arr){
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}

// s= 숫자 + 'Z' ※ 공백있음, 음수도 들어옴
// Z = 앞에 인덱스 숫자를 지움
