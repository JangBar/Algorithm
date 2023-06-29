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

		while (true) {
			line = br.readLine();
			st = new StringTokenizer(line);

			int a = Integer.parseInt(st.nextToken());
			int aa = a * a;
			int b = Integer.parseInt(st.nextToken());
			int bb = b * b;
			int c = Integer.parseInt(st.nextToken());
			int cc = c * c;

			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			if ((aa + bb) == cc) {
				bw.write("right");
				bw.newLine();
			} else if ((bb + cc) == aa) {
				bw.write("right");
				bw.newLine();
			} else if ((cc + aa) == bb) {
				bw.write("right");
				bw.newLine();
			} else {
				bw.write("wrong");
				bw.newLine();
			}

		}

		br.close();
		bw.flush();
		bw.close();
	}
}