import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();
        
        if (str.isEmpty()) {
            System.out.println(0);
            sc.close();
            return;
        }

        System.out.println(str.split(" ").length);

        sc.close();
    }
}
