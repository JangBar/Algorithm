import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1;
		StringTokenizer st2;

		double num1 = Integer.parseInt(br.readLine());
		String num2 = br.readLine();
		st1 = new StringTokenizer(num2, " ");
		double a = Integer.MIN_VALUE;

		for (int i = 1; i <= num1; i++) {
			double b = Integer.parseInt(st1.nextToken());
			if (b > a) {
				a = b;
			}
		}

		double d = 0;
		st2 = new StringTokenizer(num2, " ");

		for (int j = 1; j <= num1; j++) {
			double c = Integer.parseInt(st2.nextToken());

			d = d + (c / a) * 100;
		}

		bw.write(String.valueOf(d / num1));

		br.close();
		bw.flush();
		bw.close();
	}
}