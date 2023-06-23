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

		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 1; i <= num1; i++) {
			int num2 = Integer.parseInt(st.nextToken());

			if (num2 < minValue) {
				minValue = num2;
			}

			if (num2 > maxValue) {
				maxValue = num2;
			}
		}

		bw.write(String.valueOf(minValue + " " + maxValue));

		br.close();
		bw.flush();
		bw.close();
	}
}