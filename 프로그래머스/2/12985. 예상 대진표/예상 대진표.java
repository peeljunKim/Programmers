class Solution{
    /**
    @param n 게임 참가자 수
    @param a 처음 라운드에서 참가자 경쟁자
    @param b B참가자와 몇 번째 라운드에서 만나는지
    **/
    public int solution(int n, int a, int b){
        int answer = 0;
        boolean isMatch = true;
        
        while(true){
            answer++;
            if(Math.abs(a - b) == 1 && Math.min(a, b) % 2 == 1){
                break;
            }
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            
        }
        
        return answer;
    }
    

}
// !!! 게임은 최종 한 명이 남을 때까지 진행됩니다.
// 1 ~ N번의 참가자끼리 게임 진행
// 게임에서 이긴 사람은 다음 라운드 진출
// 다음 라운드에 진출한 참가자의 번호는 다시 1번 부터 N/2으로 배정
// A번 참가자와 B번 참가자는 서로 붙게 되기 전까지 항상 이긴다고 가정