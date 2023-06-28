import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine().toLowerCase();

		int[] count = new int[26]; // 알파벳 등장 횟수를 저장할 배열
		int maxCount = 0; // 가장 많이 등장한 알파벳의 개수
		char maxChar = '?'; // 가장 많이 등장한 알파벳

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int index = c - 'a'; // 알파벳의 인덱스 계산
			count[index]++; // 해당 알파벳 등장 횟수 증가
			if (count[index] > maxCount) {
				maxCount = count[index];
				maxChar = Character.toUpperCase(c);

			} else if (count[index] == maxCount) {
				maxChar = '?';

			}
		}

		bw.write(String.valueOf(maxChar));
		br.close();
		bw.flush();
		bw.close();
	}
}