/*
 * Write a program that, given a sentence where each word has a single digit positive integer as a prefix and suffix, swaps the numbers while retaining the word in between. Words in the sentence are delimited from each other by a space.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SwapNumbers {

	public static void main(String[] args) {
		File file = new File(
				"D:/Java Code Base/CodingQuestions/SwapNumbers.txt");
		String line;
		int i, length;
		String word, suffix, prefix, brokenWord;
		ArrayList<String> arr = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					// arr.add(st.nextToken());
					word = st.nextToken();
					length = word.length();
					// System.out.println(length);
					suffix = String.valueOf(word.charAt(0));
					// System.out.println(suffix);
					prefix = String.valueOf(word.charAt(length - 1));
					// System.out.println(prefix);
					brokenWord = word.substring(1, length - 1);
					// System.out.println(brokenWord);
					System.out.print(prefix + brokenWord + suffix + " ");
				}
				System.out.println("");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
