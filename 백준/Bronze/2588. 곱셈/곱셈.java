import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a, c, d, e;
		String[] b;
		String str1 = br.readLine();
		String str2 = br.readLine();

		a = Integer.parseInt(str1);
		b = str2.split("");
		c = b.length - 1;
		d = 0;
		e = 10;

		for (int i = c; i >= 0; i--) {
			bw.write((a * Integer.parseInt(b[i])) + "\n");
			if (i == c) {
				d += (a * Integer.parseInt(b[i]));
			} else {
				d += (a * Integer.parseInt(b[i]) * e);
				e *= 10;
			}
		}
		bw.write(d + " ");
		bw.flush();
		bw.close();
	}
}