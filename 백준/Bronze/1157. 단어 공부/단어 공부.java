import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next(); 
        int[] cnt = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // 대소문자 구분
            if (ch >= 'a' && ch <= 'z') {
                cnt[ch - 'a']++;
            } else { 
                cnt[ch - 'A']++;
            }
        }

        int max = -1;
        int maxIdx = -1;
        boolean isMatch = false;

        // 빈도 체크
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                maxIdx = i;
                isMatch = false;
            } else if (cnt[i] == max) {
                isMatch = true;
            }
        }

        if (isMatch) {
            System.out.println("?");
        } else {
            System.out.println((char) ('A' + maxIdx)); // 아스키 코드 이용
        }

        sc.close();
    }
}
