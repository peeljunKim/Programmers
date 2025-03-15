class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] list = String.valueOf(x).split("");
        int temp = 0;
        for(String str : list){
            temp += Integer.parseInt(str);
        }
        
        
        return x % temp == 0 ? true : false;
    }
}

// 각 자릿수의 합으로 x를 나눠서 나머지가 없으면 하샤드 수