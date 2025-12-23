import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String[] words = new String[5];
        int maxLen = 0;

        // maxLen 구하기
        for (int i = 0; i < 5; i++) {
            words[i] = sc.nextLine();
            if (words[i].length() > maxLen) {
                maxLen = words[i].length();
            }
        }

        for (int col = 0; col < maxLen; col++) {
            for (int row = 0; row < 5; row++) {
                if (col < words[row].length()) { // 행 마다 단어 갯수가 다를 수 있음
                    sb.append(words[row].charAt(col));
                }
            }
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
