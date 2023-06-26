import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashSet<Integer> set = new HashSet<>();
		for (int i = 1; i <= 10; i++) {
			int num = Integer.parseInt(br.readLine());
			int num2 = num % 42;
			set.add(num2);
		}
		bw.write(String.valueOf(set.size()));
		bw.newLine();

		br.close();
		bw.flush();
		bw.close();
	}
}