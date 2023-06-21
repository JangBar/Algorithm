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

		st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int num3 = Integer.parseInt(st.nextToken());

		if (num1 == num2 && num2 == num3) {
			bw.write(String.valueOf((10000 + (num1 * 1000))));
		} else if (num1 == num2 || num2 == num3) {
			bw.write(String.valueOf((1000 + (num2 * 100))));
		} else if (num1 == num3) {
			bw.write(String.valueOf((1000 + (num1 * 100))));
		} else if ((num1 != num2 && num2 != num3 && num1 != num3) && (num1 > num2) && (num1 > num3)) {
			bw.write(String.valueOf((num1 * 100)));
		} else if ((num1 != num2 && num2 != num3 && num1 != num3) && (num2 > num3) && (num2 > num1)) {
			bw.write(String.valueOf((num2 * 100)));
		} else if ((num1 != num2 && num2 != num3 && num1 != num3) && (num3 > num1) && (num3 > num2)) {
			bw.write(String.valueOf((num3 * 100)));
		} else if ((num1 != num2 && num2 != num3 && num1 != num3) && (num1 > num3) && (num1 > num2)) {
			bw.write(String.valueOf((num1 * 100)));
		}

		br.close();
		bw.flush();
		bw.close();
	}
}