import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String num;

		while (true) {
			num = br.readLine();

			if (num == null || num.isEmpty()) {
				break;
			}

			bw.write(num);
			bw.newLine();
		}

		br.close();
		bw.flush();
		bw.close();
	}
}