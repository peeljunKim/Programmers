import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();          // 과목 개수
        double[] scores = new double[N]; 
        double max = 0;                
        double sum = 0;
        
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextDouble();
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        
        for (int i = 0; i < N; i++) {
            sum += (scores[i] / max) * 100.0;
        }

        double result = sum / N;

        System.out.println(result);

        sc.close();
    }
}
