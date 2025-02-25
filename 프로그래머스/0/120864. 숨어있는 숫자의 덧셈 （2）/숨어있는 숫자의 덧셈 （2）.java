import java.util.*;
import java.util.regex.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuffer sb = new StringBuffer(my_string);
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(sb.toString());
        
        while (matcher.find()) {
            answer += Integer.parseInt(matcher.group());
        }
        
        return answer;
    }
}