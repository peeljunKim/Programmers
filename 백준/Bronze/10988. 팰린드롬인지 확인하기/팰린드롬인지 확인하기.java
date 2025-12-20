import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); 
        int left = 0; // 첫번째 인덱스
        int right = str.length() - 1; // 마지막 인덱스
        boolean isMatch = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isMatch = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isMatch ? 1 : 0);

        sc.close();
    }
}
