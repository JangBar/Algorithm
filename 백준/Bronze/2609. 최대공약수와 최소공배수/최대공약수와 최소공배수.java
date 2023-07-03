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

        String nums = br.readLine();
        st = new StringTokenizer(nums, " ");

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcd = gcd(num1, num2);  // 최대 공약수 계산

        int lcm = num1 * num2 / gcd;  // 최소 공배수 계산

        bw.write(gcd + " " + lcm);

        br.close();
        bw.flush();
        bw.close();
    }

    // 최대 공약수 계산을 위한 유클리드 호제법 사용
    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}