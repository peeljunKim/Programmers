import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'c') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-')) {
                    i++; // 다음 문자까지 한 글자로 처리
                }
            } else if (c == 'd') {
                if (i + 1 < s.length() && s.charAt(i + 1) == '-') {
                    i++; // d-
                } else if (i + 2 < s.length() && s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
                    i += 2; // dz=
                }
            } else if (c == 'l') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'j') {
                    i++; // lj
                }
            } else if (c == 'n') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'j') {
                    i++; // nj
                }
            } else if (c == 's') {
                if (i + 1 < s.length() && s.charAt(i + 1) == '=') {
                    i++; // s=
                }
            } else if (c == 'z') {
                if (i + 1 < s.length() && s.charAt(i + 1) == '=') {
                    i++; // z=
                }
            }

            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
