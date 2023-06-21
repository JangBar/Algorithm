import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
			bw.write("1");
		} else {
			bw.write("0");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
