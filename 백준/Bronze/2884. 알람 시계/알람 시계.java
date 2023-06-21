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
		st = new StringTokenizer(str);

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		if (num2 < 45) {

			if ((num1 - 1) < 0) {
				bw.write(String.valueOf(23) + " ");
				bw.write(String.valueOf(60 - (45 - num2)));
			} else {
				bw.write(String.valueOf((num1 - 1)) + " ");
				bw.write(String.valueOf(60 - (45 - num2)));
			}

		} else {
			bw.write(String.valueOf((num1)) + " ");
			bw.write(String.valueOf((num2 - 45)));
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
