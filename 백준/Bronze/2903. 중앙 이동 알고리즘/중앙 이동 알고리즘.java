import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); 

        int side = (1 << num) + 1; 
        int result = side * side;

        System.out.println(result);

        sc.close();
    }
}