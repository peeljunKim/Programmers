import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   
        int answer = 0;         

        for (int t = 0; t < N; t++) {
            String word = sc.next();   
            boolean[] arr = new boolean[26]; // 끝난 알파벳 확인
            boolean isMatch = true;
            char prev = 0;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                if (ch != prev) {
                    int idx = ch - 'a';

                    if (arr[idx]) {
                        isMatch = false;
                        break;
                    }

                    arr[idx] = true;
                    prev = ch;
                }
            }

            if (isMatch) answer++;
        }

        System.out.println(answer);
        sc.close();
    }
}
