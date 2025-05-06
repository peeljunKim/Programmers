import java.util.*;

class Solution {
    
    private static final int[][] KEYPAD = {
        {3, 1}, // 0
        {0, 0}, {0, 1}, {0, 2}, // 1, 2, 3
        {1, 0}, {1, 1}, {1, 2}, // 4, 5, 6
        {2, 0}, {2, 1}, {2, 2}  // 7, 8, 9
    };
    
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[] left = {3, 0};  // '*'
        int[] right = {3, 2}; // '#'
        
        for (int num : numbers) {
            int[] result = KEYPAD[num];

            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                left = result;
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                right = result;
            } else {
                int leftDist = Math.abs(left[0] - result[0]) 
                                + Math.abs(left[1] - result[1]);
                int rightDist = Math.abs(right[0] - result[0]) 
                                + Math.abs(right[1] - result[1]);

                if (leftDist < rightDist) {
                    sb.append("L");
                    left = result;
                } else if (leftDist > rightDist) {
                    sb.append("R");
                    right = result;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = result;
                    } else {
                        sb.append("R");
                        right = result;
                    }
                }
            }
        }
        
        String answer = sb.toString();
        return answer;
    }
}