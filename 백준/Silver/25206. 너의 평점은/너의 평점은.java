import java.util.*;

public class Main {

    private static double gradeToScore(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F":  return 0.0;
            default:   return -1.0; // P는 제어 키워드로 제어
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalScore = 0.0; 
        double totalCnt = 0.0;  

        for (int i = 0; i < 20; i++) {
            String name = sc.next();  // 과목명
            double score = sc.nextDouble();  // 학점
            String grade = sc.next();  // 등급

            if (grade.equals("P")) continue;

            double point = gradeToScore(grade);

            totalScore += score;
            totalCnt += score * point;
        }

        double result = totalCnt / totalScore;
        System.out.println(result);

        sc.close();
    }
}
