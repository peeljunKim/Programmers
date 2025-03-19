class Solution {
    public String solution(int n) {
        String answer = "";
        String odd = "수";
        // String even = "박";
        String even = "수박";
        int num = n/2;
        StringBuilder sb = new StringBuilder();
        // for(int i=1; i<=n; i++){
        //     if(i % 2 == 1){
        //         sb.append(odd);
        //     }else{
        //         sb.append(even);
        //     }
        // }
        
        for(int i=0; i<num; i++){
            sb.append(even);
        }
        if(n % 2 == 1){
            sb.append(odd);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}