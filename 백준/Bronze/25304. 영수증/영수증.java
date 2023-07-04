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

		int num = 0;
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		for (int i = 0; i < num2; i++) {
			String str = br.readLine();
			st = new StringTokenizer(str, " ");
			int num3 = Integer.parseInt(st.nextToken());
			int num4 = Integer.parseInt(st.nextToken());
			num += num3 * num4;
		}

		if (num == num1) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}