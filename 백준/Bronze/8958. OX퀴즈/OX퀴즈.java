import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int result = 0;
		int result2 = 0;

		for (int i = 1; i <= num; i++) {

			String str = br.readLine();
			String[] strs = str.split("");
			int n = strs.length;

			for (int j = 0; j < n; j++) {

				String jj = strs[j];
				String O = "O";
				if (O.equals(jj)) {
					result++;
					result2 += result;
				} else {
					result = 0;
				}
			}
			bw.write(String.valueOf(result2));
			bw.newLine();
			result = 0;
			result2 = 0;
		}

		br.close();
		bw.flush();
		bw.close();
	}
}