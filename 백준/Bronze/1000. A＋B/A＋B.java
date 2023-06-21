import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a,b;
        String[] strs = br.readLine().split(" ");


        a = Integer.parseInt(strs[0]);
        b = Integer.parseInt(strs[1]);

        bw.write((a + b) + "");
        bw.flush();
        bw.close();
    }
}