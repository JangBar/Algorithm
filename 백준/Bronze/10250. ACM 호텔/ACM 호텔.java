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

		String h;
		int count = 0;
		for (int i = 0; i < num; i++) {
			String strs = br.readLine();

			st = new StringTokenizer(strs, " ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			count = 0;
			for (int l = 1; l <= W; l++) {
				for (int k = 1; k <= H; k++) {
					count++;
					if (count == N) {
						if (l < 10) {
							h = (k + "0" + l);
						} else {
							h = ((k + "") + (l + ""));
						}
						bw.write(h);
						bw.newLine();
						break;
					}
				}

			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}