class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        if(n < 2){
            return 0;
        }
        
        while(n >= a){
            int koke = (n / a) * b; // 새로운 콜라
            // System.out.println("n = " + n + " tmep = " + temp);
            answer += koke; 
            n = (n % a) + koke;
            System.out.println("n = "+ n);
        }
        
        return answer;
    }
}
// 보유 중인 빈 병이 2개 미만이면, 콜라를 받을 수 없다.
// 필요한 빈 병 = a, 새로운 콜라 = b