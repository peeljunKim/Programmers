import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();          
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cnt; i++) {
            int R = sc.nextInt();      
            String str = sc.next();      

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j); // 반복할 단어
                
                for (int k = 0; k < R; k++) {
                    sb.append(ch);
                }
            }
            sb.append('\n');           
        }

        System.out.print(sb.toString());

        sc.close();
    }
}
