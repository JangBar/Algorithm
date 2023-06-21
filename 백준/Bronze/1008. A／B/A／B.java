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
        
        // 소수점까지 나오려면 리턴받을 변수는 double 이어야 하면 
        // 양쪽 어느 숫자이든 하나만 실수형이면 된다.
        bw.write(((double)a / b)+" ");
        bw.flush();
        bw.close();
    }
}