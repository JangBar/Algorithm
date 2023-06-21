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

		int num = Integer.parseInt(br.readLine());

		if (100 >= num && 90 <= num) {
			bw.write("A");
		} else if (89 >= num && 80 <= num) {
			bw.write("B");
		} else if (79 >= num && 70 <= num) {
			bw.write("C");
		} else if (69 >= num && 60 <= num) {
			bw.write("D");
		} else {
			bw.write("F");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
