class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int length = numbers.length;
        int idx = 2*(k-1);
        
        // 처음 사람인 경우
        if(k==1){
            answer = numbers[1];
            
        // idx가 배열의 길이보다 커져서 %를 사용해야 되는 경우
        }else if(idx > length){
            idx = idx % length;
            if(idx==0){
                idx = 0;
            }
        }
        answer = numbers[idx];
        
        return answer;
    }
}
// idx = 2
// idx = 8
// idx = 

