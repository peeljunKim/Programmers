import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt(); 
        int makingHour = sc.nextInt(); 

        min += makingHour;
        
        // min이 60분 넘는 경우
        hour += min / 60;   
        min = min % 60;    
        
        // hour가 24시간 넘는 경우
        hour = hour % 24;

        System.out.println(hour + " " + min);
    }
}