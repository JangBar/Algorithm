import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = 0;
		String result;
		String result2;
		while (num == 0) {

			num = Integer.parseInt(br.readLine());
			if (num == 0) {
				break;
			}
			result = String.valueOf(num);
			StringBuffer sb = new StringBuffer(result);
			result2 = sb.reverse().toString();

			if (result.equals(result2)) {
				bw.write("yes");
				bw.newLine();
				num = 0;
			} else {
				bw.write("no");
				bw.newLine();
				num = 0;
			}

		}

		br.close();
		bw.flush();
		bw.close();
	}
}