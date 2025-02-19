class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        boolean bool = true;
        
        while(bool){
            bool = false;
            
            for(int i=0; i<num_list.length; i++){
                if(num_list[i] != 1){
                    if(num_list[i] % 2 ==0){
                        num_list[i] /= 2;
                        answer++;
                        bool = true;
                    } else{
                        num_list[i] = (num_list[i]-1) / 2;
                        answer++;
                        bool = true;
                    }
                }
            }
        }
        

        
        
        
        return answer;
    }
}