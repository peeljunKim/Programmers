class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long num1 = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-p.length(); i++){
            // String str = t.substring(0 + i, p.length() + i);
            long num2 = Long.parseLong(t.substring(i, p.length() + i));
            if(num1 >= num2){
                answer++;
            }
        }
        return answer;
    }
}
// t의 길이 10,000