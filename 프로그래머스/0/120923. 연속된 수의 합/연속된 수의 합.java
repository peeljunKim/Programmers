class Solution {
    public int[] solution(int num, int total) { // start가 이게 왜 적용되는지 모르겠음 ㅋㅋ
        int[] answer = new int [num];
        int center = total / num;
        
        if(num % 2 != 0){ // num이 홀수인 경우
            int start = center - (num / 2);
            for (int i = 0; i < num; i++) {
                answer[i] = start + i;
            }
        }else{
            int start = center - (num / 2) + 1; 
            for (int i = 0; i < num; i++) {
                answer[i] = start + i;
            }
        }
        
        return answer;
    }
}
// 연속된 숫자를 더해서 total이 안되는 경우는 없음
// 숫자 갯수는 num의 값

/*
num이 홀수면 result의 가운데 값이 total/num ??
x, x+1, x+2, ..., x+(num-1)
num=3, total=12
x, x+1, x+2
x+1 = 4
1 0 1

num=5, total=15
x, x+1, x+2, x+3, x+4
x+2 = 3
2 1 0 1 2
*/