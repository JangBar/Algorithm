import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int result = 0;
		LinkedList<Integer> ll = new LinkedList<>();

		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			int num2 = Integer.parseInt(br.readLine());

			if (num2 != 0) {
				ll.add(num2);
			} else {
				ll.removeLast();
			}
		}
		for (int num3 : ll) {
			result += num3;
		}

		bw.write(String.valueOf(result));

		br.close();
		bw.flush();
		bw.close();

	}
}