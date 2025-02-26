import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        BigInteger answer = function2(balls, share);
        return answer.intValue(); 
    }
    
    public static BigInteger function2(int balls, int share) {
        if (share == 0 || share == balls) {
            return BigInteger.ONE;
        }
        return function1(balls).divide(
            function1(share).multiply(function1(balls - share)));
    }
    
    public static BigInteger function1(int num) {
        if (num == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(num).multiply(function1(num - 1));
        }
    }
}




// 구슬은 모두 다른 구술
// 구슬의 개수 == balls, 나눠줄 구슬 개수 == share