import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        sc.nextLine(); // 라인 맞추는 용도
        
        StringBuilder sb = new StringBuilder(); 

        for (int i = 0; i < cnt; i++) {
            String str = sc.nextLine();  

            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);

            sb.append(first).append(last).append('\n');
        }

        System.out.print(sb.toString());

        sc.close();
    }
}
