import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Percentage {

	public static void main(String[] args) {

		FileInputStream fis;
		try {
			fis = new FileInputStream(
					"D:/Java Code Base/CodingQuestions/Percentage.txt");
			DataInputStream dis = new DataInputStream(fis);
			BufferedReader br = new BufferedReader(new InputStreamReader(dis));
			DecimalFormat df = new DecimalFormat("0.00");
			String line;
			while ((line = br.readLine()) != null) {
				int length = line.length();
				double lowercase = 0;
				double uppercase = 0;
				float lcp;
				float ucp;
				for (int i = 0; i < length; i++) {
					if ((line.substring(i, i + 1)).matches("[a-z]")) {
						lowercase++;
						// System.out.println("lc" +lowercase);
					} else {
						uppercase++;
						// System.out.println("uc" +uppercase);
					}

				}

				lcp = (float) (lowercase / length) * 100;
				ucp = (float) ((uppercase / length) * 100);
				System.out.println("lowercase: " + df.format(lcp)
						+ " uppercase:" + df.format(ucp));

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
