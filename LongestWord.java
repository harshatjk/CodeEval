import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LongestWord {
	public static void main(String[] args) {
		File file = new File(
				"D:/Java Code Base/CodingQuestions/LongestWord.txt");
		String line, word, finalWord = "";
		int length, maxLength = 0, count;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				count = 0;
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					word = st.nextToken();
					length = word.length();
					count++;
					if (count <= 1) {
						finalWord = word;
						maxLength = length;
					} else if (count >= 2 && length > maxLength) {
						finalWord = word;
						maxLength = length;
					}
				}
				System.out.println(finalWord);
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
