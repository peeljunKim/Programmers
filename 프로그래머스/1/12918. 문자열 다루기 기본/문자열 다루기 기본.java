class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        try{
            if(s.length() == 4 || s.length() == 6){
                Integer.parseInt(s);
                return true;
            }
            return false;
        }catch(NumberFormatException e){
            return false;
        }

    }
}
// 문자 길이 4 or 6
// 숫자로만 이루어지면 ture