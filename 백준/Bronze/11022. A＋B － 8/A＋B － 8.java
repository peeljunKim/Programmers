import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine()); 
        StringBuilder sb = new StringBuilder();  

        for (int i = 1; i <= cnt; i++) { 
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken()); // 첫 번째 수
            int num2 = Integer.parseInt(st.nextToken()); // 두 번째 수
            int result = num1 + num2;

            sb.append("Case #"+ i + ": ")
              .append(num1 + " + " + num2 + " = " + result)
              .append('\n');
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}