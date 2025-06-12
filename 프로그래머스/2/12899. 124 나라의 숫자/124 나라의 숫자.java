class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        String[] arr = {"4", "1", "2"};
        // boolean test = true;
        
        while(n > 0){
            int temp = n % 3; // 이게 인덱스가 됨
            sb.insert(0, arr[temp]);
            if (temp == 0) { // 0인 경우
                n = (n / 3) - 1;
            } else { // 나머지가 1 또는 2인 경우
                n = n / 3;
            }
            // System.out.println(sb.toString());
            // System.out.println(n);
            // test = false;
        }
        
        String answer = sb.toString();
        // System.out.println("/ = " + (123 / 4) + ", % = " + (123 % 4));
        
        
        return answer;
    }
}

// 1, 2, 4만 사용
// 1<= n <= 50 000 000