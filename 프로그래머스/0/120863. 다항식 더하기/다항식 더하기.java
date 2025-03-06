import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String [] arr = polynomial.split(" ");
        int value_x = 0; // x 계수의 값
        int temp = 0; // 상수 값
        
        for(String str : arr){
            if(str.equals("+")){ // +가 나오면 바로 다음 인덱스 실행
                continue;
            }
            // System.out.println(str);
            
            if(str.contains("x")){
                // System.out.println(str);
                String x = str.replace("x", "");
                if(x.isEmpty()){ // x의 계수가 1인 경우
                    value_x++;
                    // System.out.println("x인 경우");
                }else{
                    value_x += Integer.parseInt(x);
                }
            }else{ // 상수항 처리 부분(이 부분을 확실하게 하고 싶음 개인적으로 애매한거 같음)
                temp += Integer.parseInt(str);
            }
        }
        
        if(temp == 0){
            if(value_x == 1){
                answer = "x";
            }else{
                answer = value_x+"x";
            }
            
        }else if(value_x == 0){
            answer = String.valueOf(temp);
            
        } else {
            if(value_x == 1){
                answer = "x + " + temp;
            }else{
                answer = value_x + "x + " + temp;
            }
            
        }
        
        return answer;
    }
}
// 변수는 x만 존재
// 연산기호는 + 만 존재
// 상수항은 맨 마지막

/*
연산기호가 +만 존재하고 변수는 x만 존재하니까 야매로 x끼리 더하고 상수끼리 더하면 될 듯??
*/