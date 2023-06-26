import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String strs = br.readLine();
		char[] abc = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (int i = 0; i < abc.length; i++) {
			boolean found = false;
			for (int j = 0; j < strs.length(); j++) {
				if (abc[i] == strs.charAt(j)) {
					bw.write(String.valueOf(j) + " ");
					found = true;
					break;
				}
			}
			if (!found) {
				bw.write("-1 ");
			}
		}

		bw.newLine();
		br.close();
		bw.flush();
		bw.close();
	}
}
