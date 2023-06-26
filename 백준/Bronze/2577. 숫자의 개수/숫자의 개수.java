import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		String m = String.valueOf(a * b * c);
		String[] strs = m.split("");
		int num = strs.length;

		int result = 0;

		for (int i = 0; i <= 9; i++) {
			result = 0;
			for (int j = 0; j < num; j++) {
				int jj = Integer.parseInt(strs[j]);
				if (i == jj) {
					result++;
				}
			}
			bw.write(String.valueOf(result));
			bw.newLine();
		}

		br.close();
		bw.flush();
		bw.close();
	}
}