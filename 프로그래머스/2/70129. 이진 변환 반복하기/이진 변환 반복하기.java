class Solution {
    public int[] solution(String s) {
        int[] answer = new int [2]; // 횟수, 0의 개수
        int convertCnt = 0;
        int removedZeroCnt = 0;
        
        while (!s.equals("1")) { // s가 1 아닐 때 까지 반복
            convertCnt++;

            int zero = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zero++;
                }
            }

            removedZeroCnt += zero;

            int oneLength = s.length() - zero;

            s = Integer.toBinaryString(oneLength);
        }
        
        answer[0] = convertCnt;
        answer[1] = removedZeroCnt;
        return answer;
    }
}