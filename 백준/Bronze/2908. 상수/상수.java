import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next(); 
        String B = sc.next(); 

        int num1 = Integer.parseInt(new StringBuilder(A).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(B).reverse().toString());

        System.out.println(Math.max(num1, num2));

        sc.close();
    }
}
