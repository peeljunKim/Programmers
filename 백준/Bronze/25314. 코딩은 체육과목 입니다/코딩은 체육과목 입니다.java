import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();          
        int count = num / 4;             
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append("long ");
        }

        sb.append("int");              

        System.out.println(sb.toString());
    }
}