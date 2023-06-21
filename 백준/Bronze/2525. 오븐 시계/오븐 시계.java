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

         st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int num3 = Integer.parseInt(br.readLine());
        int num4 = num3 / 60; // 요리 시간을 시간 단위로 변환
        int num5 = num3 % 60; // 요리 시간을 분 단위로 변환

        int cookedHour = num1 + num4; // 요리가 끝나는 시각(시)
        int cookedMinute = num2 + num5; // 요리가 끝나는 시각(분)

        if (cookedMinute >= 60) {
            cookedHour += 1;
            cookedMinute -= 60;
        }

        if (cookedHour >= 24) {
            cookedHour -= 24;
        }

        bw.write(cookedHour + " " + cookedMinute);

        br.close();
        bw.flush();
        bw.close();
    }
}