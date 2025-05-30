import java.util.*;
class Solution {
    /*
    @param numbers 0또는 양의 정수 배열
    return 만들 수 있는 가장 큰 수
    */
    public String solution(int[] numbers) {
        String answer = "";
        String[] strNums = new String[numbers.length];
        for(int i=0; i<numbers.length; i++) strNums[i] = numbers[i] + "";
        
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            }
        });
        // System.out.println(Arrays.toString(strNums));
        
        StringBuilder sb = new StringBuilder();
        for(String str : strNums) sb.append(str);
        
        if(sb.charAt(0) == '0') return "0"; // 0이 중복으로 나온 경우
        
        answer = sb.toString();
        
        return answer;
    }
}
// 앞자리가 부터 높은순
// ex) 9, 91이 있으면 9먼저
// ex) 91, 923 = 91먼저