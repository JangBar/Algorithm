import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
	public static void main(String[] args) throws IOException {


		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		LocalDate seoulNow = LocalDate.now(ZoneId.of("Asia/Seoul"));
        
			bw.write(String.valueOf(seoulNow));

		bw.flush();
		bw.close();
	}
}
