class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6){
            answer = s.matches("(^[0-9]*$)");
        }
        
        
        // try{
        //     if(s.length() == 4 || s.length() == 6){
        //         Integer.parseInt(s);
        //         return true;
        //     }
        //     return false;
        // }catch(Exception e){
        //     return false;
        // }
        
        return answer;
    }
}

// 다른 사람의 풀이를 봤는데 try-catch문으로 풀면 안된다고 한다. 왜냐하면
// 예외는 실제 예외 상황일때만 사용해야 되고, 예외 처리는 리소스가 많이 들어서