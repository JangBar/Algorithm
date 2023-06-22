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

		int num1 = Integer.parseInt(br.readLine());
		String num2 = br.readLine();
		st = new StringTokenizer(num2, " ");
		int num3 = Integer.parseInt(br.readLine());

		int result = 0;

		for (int i = 0; i < num1; i++) {
			int n = Integer.parseInt(st.nextToken());
			if (n == num3) {
				result++;
			}
		}
		bw.write(String.valueOf(result));
		br.close();
		bw.flush();
		bw.close();
	}
}