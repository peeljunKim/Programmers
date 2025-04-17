import java.util.regex.*; // Pattern, Matcher

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int [3];
        int idx = 0;
        
        String regex = "(\\d{1,2})([SDT])([*#]?)"; // 정규식 표현
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dartResult);
        
        while (matcher.find()) {
            int score = Integer.parseInt(matcher.group(1));
            String bonus = matcher.group(2); // {S, D, T}
            String option = matcher.group(3); // 스타상(*), 아차상(#)
            System.out.println("idx = " + idx + ", score = " + score);
            System.out.println("bonus = " + bonus);
            System.out.println("option = " + option);
 
            switch (bonus) {
                case "S": score = (int) Math.pow(score, 1); break;
                case "D": score = (int) Math.pow(score, 2); break;
                case "T": score = (int) Math.pow(score, 3); break;
            }

            
            if (option.equals("*")) { 
                score *= 2; // 스타상이 처음에 나온 경우 + 해당 인덱스
                if (idx > 0) scores[idx - 1] *= 2; // 스타상이 처음 이후에 나온 경우 + 이전 인덱스
            } else if (option.equals("#")) {
                score *= -1;
            }

            scores[idx++] = score;
        }
        // System.out.println((int) Math.pow(3, 1));
        answer = scores[0] + scores[1] + scores[2];
        
        
        return answer;
    }
}

// 총 3번의 기회
// 점수 범위 0 ~ 10
// 옵션 스타상 = 해당 점수와 바로 전에 얻은 점수를 각 2배로 만듬, 
//      아차상 = 해당 점수 마이너스
// 스타상 주의사항
// 처음에 나올 수 있음(처음 점수만 두배)
// 중첩이 될 수 있음
// 스타상 효과와 아차상 효과 중첩 가능
// Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
// 스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.