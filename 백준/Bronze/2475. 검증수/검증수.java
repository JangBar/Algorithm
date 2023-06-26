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

		String str = br.readLine();
		st = new StringTokenizer(str, " ");

		int result = 0;

		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(st.nextToken());
			result += num * num;
		}
		bw.write(String.valueOf(result % 10));
		bw.newLine();
		br.close();
		bw.flush();
		bw.close();
	}
}
