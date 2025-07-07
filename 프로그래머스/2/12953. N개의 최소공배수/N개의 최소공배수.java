class Solution {
    public int solution(int[] arr) {
        int answer = arr[0]; // 0번 인덱스를 초기 최소 공배수로 잡기
        
        for (int i = 1; i < arr.length; i++) {
            answer = getLCM(answer, arr[i]);
        }
        
        return answer;
    }
    
    
    // 최대 공약수
    private int getGCD(int num1, int num2){
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2); 
    }
    
    // 최소 공배수
    private int getLCM(int num1, int num2) {
        return (num1 * num2) / getGCD(num1, num2); 
    }
}