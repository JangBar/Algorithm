import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		// StringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스입니다.
		// 그렇게 쪼개어진 문자열을 우리는 토큰(token)이라고 부릅니다.

		String str = bfr.readLine();
		st = new StringTokenizer(str, " ");
		long sum = 0;

		for (int i = 0; i < 3; i++) {
			sum += Long.parseLong(st.nextToken());
		}

		bfw.write(String.valueOf(sum));

		bfr.close();
		bfw.flush();
		bfw.close();
	}
}