import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class FindAWriter {
	public static void main(String[] args) {
		File file = new File(
				"D:/Java Code Base/CodingQuestions/FindAWriter.txt");
		String line, encryption, key;
		int value;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			StringBuffer stb = new StringBuffer("");
			StringTokenizer str;
			while ((line = br.readLine()) != null) {
				str = new StringTokenizer(line, "|");
				stb.delete(0, stb.length());
				while (str.hasMoreTokens()) {
					encryption = str.nextToken();
					key = str.nextToken().trim();
					// System.out.println(encryption);
					// System.out.println(key);
					for (String valueString : key.split(" ")) {
						value = Integer.parseInt(valueString);
						// System.out.println(value);
						stb.append(encryption.charAt(value - 1));
					}

				}
				System.out.println(stb);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
