import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int w_min = Math.min(wallet[0], wallet[1]);
        int w_max = Math.max(wallet[0], wallet[1]);
        int[] currentBill = Arrays.copyOf(bill, bill.length);
        
        while (true) {
            int b_min = Math.min(currentBill[0], currentBill[1]);
            int b_max = Math.max(currentBill[0], currentBill[1]);
            
            if (b_min <= w_min && b_max <= w_max) {
                break; 
            }

            if (currentBill[0] >= currentBill[1]) {
                currentBill[0] /= 2;
            } else {
                currentBill[1] /= 2;
            }

            answer++;
        }
        
        return answer;
    }
}