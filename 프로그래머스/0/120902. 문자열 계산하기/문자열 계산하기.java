import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        System.out.println(Arrays.toString(arr));
        int num1 = Integer.parseInt(arr[0]); // 처음에 나온 숫자이자 result
        
        for(int i=1; i<arr.length; i+=2){
            String str = arr[i]; // 연산자
            // int num1 = Integer.parseInt(arr[i - 1]);
            int num2 = Integer.parseInt(arr[i + 1]);
                
            if(str.equals("+")){
                num1 += num2;
            }else if(str.equals("-")){
                num1 -= num2;
            }
        }
        
        answer = num1;
        

        
        return answer;
    }
}

// 연산자가 한개인 경우에만 통과됨