class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] averages = new double[score.length];
        
        for(int i=0; i<score.length; i++) {
            averages[i] = avg(score[i][0], score[i][1]) / 2;
        }
        
        for(int i=0; i<score.length; i++) {
            int rank = 1;
            for(int j=0; j<score.length; j++) {
                if(averages[i] < averages[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        
        return answer;
    }
    

    // 평균 구하는 코드를 자주 사용할 줄 알았는데...ㅠㅠ
    public static double avg(int englishScore, int mathScore){
        return (englishScore + mathScore) / 2.0;
    }
}
// 각 인원들 평균 배열을 생성
// 평균을 다른 원소들과 비교해 순위 매기기