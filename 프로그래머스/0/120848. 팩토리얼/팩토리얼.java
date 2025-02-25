class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 1; // 1씩 증가하는 값
        int factorialResult = 1; // 팩토리얼 결과 값
        
        while(factorialResult <= n){
            factorialResult *= temp;
            System.out.println(temp);
            temp++;
        }
        
        answer = temp -2;
        
        return answer;
    }
    
    public static int function(int n){
        if(n==0){
            return 1;
        }else{
            return n * function(n-1);
        }
    }
}