import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String strs = br.readLine().trim();

		if (strs.isEmpty()) {
			bw.write("0");
		} else {
			String[] result = strs.split(" ");

			int num = result.length;

			bw.write(String.valueOf(num));
		}

		bw.newLine();

		br.close();
		bw.flush();
		bw.close();
	}
}