import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str = br.readLine();
        st = new StringTokenizer(str, " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int[] arr = new int[num1];

        for (int i = 0; i < num2; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            int n1 = Integer.parseInt(st.nextToken()) - 1;
            int n2 = Integer.parseInt(st.nextToken()) - 1;
            int n3 = Integer.parseInt(st.nextToken());

            for (int j = n1; j <= n2; j++) {
                if (j < arr.length) {
                    arr[j] = n3;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(String.valueOf(arr[i]));
            if (i < arr.length - 1) {
                bw.write(" ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}