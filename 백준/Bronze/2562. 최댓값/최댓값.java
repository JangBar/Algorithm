import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int max = Integer.MIN_VALUE;
		int result = 0;
		ArrayList<Integer> n = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
			int num = Integer.parseInt(br.readLine());
			n.add(num);
			if (num > max) {
				max = num;
			}
		}

		for (int nn : n) {
			result++;
			if (nn == max) {
				break;
			}
		}
		bw.write(max + " ");
		bw.newLine();
		bw.write(result + " ");

		br.close();
		bw.flush();
		bw.close();
	}
}