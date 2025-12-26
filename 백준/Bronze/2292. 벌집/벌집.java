import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong(); 

        long end = 1;  
        int layer = 1; 

        if (N == 1) {
            System.out.println(1);
            sc.close();
            return;
        }
        
        while (end < N) {
            end += 6L * layer; 
            layer++;
        }
        
        int result = layer;

        System.out.println(result);
        sc.close();
    }
}
