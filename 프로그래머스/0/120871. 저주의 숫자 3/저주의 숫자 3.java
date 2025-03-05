class Solution {
    public int solution(int n) {
        int cnt = 0; // 3x 마을에서 쓰는 숫자
        int answer = 0; 

        
        for (int i = 1; cnt < n; i++) {
            String numToStr = i+"";
            if (i % 3 != 0 && !numToStr.contains("3")) {
                cnt++;
                answer = i; 
            }
            // answer = cnt; 
        }

        return answer;
    }
}

// for문에 조건을 
// 3x 마을에서 쓰는 숫자까지로 하면 설정하면 해결됨
// 주어진 조건에 만족하지 않으면 추가