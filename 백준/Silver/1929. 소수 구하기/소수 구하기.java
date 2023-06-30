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

		String strs = br.readLine();
		st = new StringTokenizer(strs, " ");
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		for (int i = num1; i <= num2; i++) {
			if (isPrime(i)) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}

	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}