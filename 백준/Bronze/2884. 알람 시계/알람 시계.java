import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();  
        int min = sc.nextInt();  

        min -= 45;               

        // 분이 음수
        if (min < 0) {
            min += 60;           
            hour -= 1;            

            // min이 음수며, hour가 음수가 되면 23시로 변경
            if (hour < 0) {
                hour = 23;
            }
        }

        System.out.println(hour + " " + min);   
    }
}