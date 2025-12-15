import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();      
        int[] pos = new int[26];       

        for (int i = 0; i < 26; i++) {
            pos[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);      // 현재 문자
            int idx = ch - 'a';         

            // 아직 한 번도 등장하지 않은 경우
            if (pos[idx] == -1) {
                pos[idx] = i;          
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(pos[i]);
            if (i < 25) {
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
