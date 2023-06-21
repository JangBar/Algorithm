import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a, c, d, e;
		String str1,str2;
		String[] b;
		
		str1 = br.readLine(); // 첫번째 입력 "472"
		str2 = br.readLine(); // 두번째 입력 "385"

		a = Integer.parseInt(str1); // 첫번째 입력받은수를 숫자로변환 472
		b = str2.split("");         // 두번째 입력받은수를 하나하나 나눠서 배열에 담는다 [3,8,5]
		c = b.length - 1;           // 배열의 길이를 구해서 -1을 해준다 
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