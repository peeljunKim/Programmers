import java.math.BigInteger;
class Solution {
    public int solution(String number) {
        BigInteger bigInteger = new BigInteger(number);
		bigInteger = bigInteger.mod(BigInteger.valueOf(9));
		int answer = bigInteger.intValue();
		return answer;
    }
}