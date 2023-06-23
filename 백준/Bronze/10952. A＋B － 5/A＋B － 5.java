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

		String line;
		while ((line = br.readLine()) != null) {
			st = new StringTokenizer(line, " ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			if (num1 != 0 && num2 != 0) {
				bw.write(String.valueOf(num1 + num2));
				bw.newLine();
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}