import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		if (num1 > 0 && num2 > 0) {
			bw.write("1");
		} else if (num1 < 0 && num2 > 0) {
			bw.write("2");
		} else if (num1 < 0 && num2 < 0) {
			bw.write("3");
		} else if (num1 > 0 && num2 < 0) {
			bw.write("4");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
