class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        // String str_i = i+"";
        // String str_j = j+"";
        String str_k = k+"";
        
        for(int z=i; z<=j; z++){
            String str = String.valueOf(z);
            String[] arr = str.split("");
            
            for (int idx = 0; idx < str.length(); idx++) {
                char c = str.charAt(idx);
                if (c == str_k.charAt(0)) {
                    answer++;
                }    
            }
        }
        
        return answer;
    }
}

// 1~13 1 10 11(두번) 12 13 == 6?
// 10~50 15 25 35 45 50   == 5
// 3~10 
