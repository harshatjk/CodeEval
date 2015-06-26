import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class RollerCoster {

	public static void main(String[] args) {
		File file = new File(
				"D:/Java Code Base/CodingQuestions/RollerCoster.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line, word, brokenWord, newLine;
			boolean flag;
			int i;
			while ((line = br.readLine()) != null) {
				flag = false;
				newLine = "";
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					word = st.nextToken();
					for (i = 0; i < word.length(); i++) {
						brokenWord = String.valueOf(word.charAt(i));
						if (brokenWord.matches("[a-zA-Z]") && flag == false) {

							newLine = newLine.concat(brokenWord.toUpperCase());
							flag = true;
						} else if (brokenWord.matches("[a-zA-Z]")
								&& flag == true) {
							newLine = newLine.concat(brokenWord);
							flag = false;

						} else {
							newLine = newLine.concat(brokenWord);
						}
					}
					newLine = newLine.concat(" ");
				}
				System.out.println(newLine);
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
