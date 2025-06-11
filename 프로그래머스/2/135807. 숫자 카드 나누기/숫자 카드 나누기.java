class Solution {
    // return 조건을 만족하는 가장 큰 양의 정수 a를 반환, 만족하지 않으면 0 반환
    public int solution(int[] arrayA, int[] arrayB) {
        // System.out.println(gcd(2,5));
        // System.out.println(arrayToGcd(arrayA));
        // System.out.println(temp(arrayToGcd(arrayA), arrayA));
        
        int gcdA = arrayToGcd(arrayA);
        int gcdB = arrayToGcd(arrayB);

        int numA = temp(gcdA, arrayB);
        int numB = temp(gcdB, arrayA);
        int answer = Math.max(numA, numB);
        
        return answer;
    }
    
    
    // 최대 공약수 구하는 메소드
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    
    // 배열의 모든 원소의 최대공약수를 구해주는 메소드
    private int arrayToGcd(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
            if (result == 1) { 
                return 1;
            }
        }
        return result;
    }
    
    // value 약수 중 가장 큰 값으로, 다른 배열에 원소들이랑 나눠지는지 확인
    private int temp(int value, int[] otherArray) {
        for (int d = value; d > 0; d--) {
            if (value % d == 0) {
                boolean isInvalid = false;
                // d가 otherArray의 어떤 원소라도 나눠지는지 확인
                for (int num : otherArray) {
                    if (num % d == 0) {
                        isInvalid = true;
                        break; 
                    }
                }
                // d가 otherArray의 어떤 원소도 나누지 않으면 d가 가장 큰 약수임
                if (!isInvalid) {
                    return d;
                }
            }
        }
        return 0;
    }
}