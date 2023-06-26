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

		for (int i = 1; i <= num1; i++) {
			String strs = br.readLine();
			st = new StringTokenizer(strs, " ");
			int num2 = Integer.parseInt(st.nextToken());

			String str = st.nextToken();
			String[] s = str.split("");

			for (int j = 0; j < s.length; j++) {
				for (int k = 0; k < num2; k++) {

					bw.write(String.valueOf(s[j]));
				}

			}
			bw.newLine();
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
