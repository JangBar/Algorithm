import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] attendance = new boolean[31];  // 출석 여부를 저장하는 배열
 
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            attendance[num] = true;  // 출석한 학생 표시
        }

        for (int i = 1; i <= 30; i++) {
            if (!attendance[i]) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}