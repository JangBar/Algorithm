import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] nums = str.split(" ");

        boolean[] isPrime = new boolean[1000001]; // 1000000까지의 수에 대해 소수 여부를 저장하는 배열
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        for (int i = 2; i <= 1000000; i++) {
            isPrime[i] = true; // 일단 모든 수를 소수로 설정
        }

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i <= 1000000; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j <= 1000000; j += i) {
                    isPrime[j] = false; // i의 배수들은 소수가 아님
                }
            }
        }

        for (int i = 0; i < num; i++) {
            int num2 = Integer.parseInt(nums[i]);
            if (isPrime[num2]) {
                result++;
            }
        }

        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }
}