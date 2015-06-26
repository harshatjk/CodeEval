/*You’ve got a binary code which has to be buried among words in order to unconsciously pass the cipher. 
Create a program that would cover the word with a binary mask. If, while covering, a letter finds itself as 1, you have to change its register to the upper one, if it’s 0, leave it as it is. Words are always in lower case and in the same row with the binary mask.
 * 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringMask {
	public static void main(String[] args) {
		File file = new File("D:/Java Code Base/CodingQuestions/StringMask.txt");
		String line;
		String word;
		String binaryCode;
		int i;
		String e;
		String f;
		String newWord;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				newWord = "";
				while (st.hasMoreTokens()) {
					word = st.nextToken();
					// System.out.println(word);
					binaryCode = st.nextToken();
					// System.out.println(binaryCode);
					for (i = 0; i < word.length(); i++) {
						e = String.valueOf(word.charAt(i));
						f = String.valueOf(binaryCode.charAt(i));
						if (f.equals("1")) {
							e = e.toUpperCase();
							// System.out.println(e);
						}
						newWord = newWord.concat(e);
						// System.out.println(newWord);
					}
					System.out.println(newWord);
				}

			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
}
