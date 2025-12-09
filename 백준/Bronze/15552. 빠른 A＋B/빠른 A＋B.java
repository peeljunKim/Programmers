import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine()); 

        StringBuilder sb = new StringBuilder();  

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A + B).append('\n'); 
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
        // System.out.print(sb.toString());
    }
}