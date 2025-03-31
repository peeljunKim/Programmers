import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            String result = to2(arr1[i], arr2[i], n);
            
            for(int j=0; j<n; j++){
                if(result.charAt(j)== '1'){
                    sb.append("#");
                }else{
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            sb.setLength(0); // 해당 메소드는 StringBuilder의 내용을 모두 지움
            
            // System.out.println("result = "+ result);
            // System.out.println("str2 = " + str2);
        }
        
        return answer;
    }
    
    public static String to2(int num1, int num2, int length){
        int temp = num1 | num2;
        
        String str = Integer.toBinaryString(temp);
        
        while(str.length() < length){
            str = "0" + str;
        }
        
        if (str.length() > length) {
            str = str.substring(str.length() - length);
        }
        return str;
    }
    
}

// 지도 정사각형 한 변의 길이 n
// 각 칸의 공백(" ") 또는 벽(#)으로 이루어짐
// 지도1, 지도 한 곳이 벽이면 벽
// 공백0, 벽1