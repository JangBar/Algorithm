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

		String strs = br.readLine();
		st = new StringTokenizer(strs, " ");

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		if (num1 > num2) {
			bw.write(">");
		} else if (num1 < num2) {
			bw.write("<");
		} else {
			{
				bw.write("==");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
