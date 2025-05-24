class Solution {
    
    private int answer =0;
    /*
    @param numbers 사용할 숫자 배열
    @param target 타겟 숫자
    return 타겟 숫자를 만드는 방법의 수
    */
    public int solution(int[] numbers, int target) {
        example(numbers, target, 0, 0);
        return answer;
    }
    
    private void example(int[] numbers, int target, int idx, int sum){
        if(idx == numbers.length){
            if(sum == target){
                answer++;
            }    
            return ;
        }
        
        example(numbers, target, idx + 1, sum + numbers[idx]);
        example(numbers, target, idx + 1, sum - numbers[idx]);
    }
}