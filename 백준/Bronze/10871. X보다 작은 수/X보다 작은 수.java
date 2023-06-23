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

		String strs1 = br.readLine();
		String strs2 = br.readLine();
		st = new StringTokenizer(strs1, " ");
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(strs2, " ");

		for (int i = 1; i <= num1; i++) {
			int result = Integer.parseInt(st.nextToken());
			if (num2 > result) {

				bw.write(String.valueOf(result)+" ");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}