import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WithoutRepetitions {
	public static void main(String[] args) {
		File file = new File("D:/Java Code Base/CodingQuestions/NoRepeat.txt");
		String word, currentChar, nextChar, prevChar, newWord;
		int i, length;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;

			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					word = st.nextToken();
					newWord = "";
					length = word.length();
					if (length == 2) {
						currentChar = String.valueOf(word.charAt(0));
						nextChar = String.valueOf(word.charAt(1));
						if (!(currentChar.equals(nextChar))) {
							newWord = newWord.concat(currentChar);
							newWord = newWord.concat(nextChar);
						} else {
							newWord = newWord.concat(currentChar);
							
						}
					} else if (length == 1) {
						currentChar = String.valueOf(word.charAt(0));
						newWord = newWord.concat(currentChar);
					}

					else {

						for (i = 2; i < word.length(); i++) {
							prevChar = String.valueOf(word.charAt(i - 2));
							currentChar = String.valueOf(word.charAt(i - 1));
							nextChar = String.valueOf(word.charAt(i));

							if (currentChar.equals(prevChar)) {
								if (nextChar.equals(prevChar)) {
									continue;
								}
							} else {
								newWord = newWord.concat(prevChar);
							}

							if ((i == word.length() - 1)
									&& !(currentChar.equals(nextChar))) {
								newWord = newWord.concat(currentChar);
								newWord = newWord.concat(nextChar);

							}

							else if ((i == word.length() - 1)
									&& (currentChar.equals(nextChar))) {
								newWord = newWord.concat(currentChar);
							}

						}

						// if (currentChar.equals(nextChar)) {
						// repeatedChar = currentChar;
						// }
						// if (repeatedChar != null) {
						// newWord = newWord.concat(repeatedChar);
						// repeatedChar = null;
						// } else {
						// newWord = newWord.concat(nextChar);
						// }
						// }

					}
					System.out.print(newWord + " ");

					
				}
				System.out.println("");
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
