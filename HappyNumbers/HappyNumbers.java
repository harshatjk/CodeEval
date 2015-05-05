import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class HappyNumbers {
	static ArrayList<Integer> numberList = new ArrayList<Integer>();
	static int counter;

	void calculateHappiness(int number, ArrayList<Integer> numberList) {

		int digit = 0;
		int result = 0;
		while (number != 0) {
			digit = number % 10;
			result = result + (digit * digit);
			number = number / 10;
		}
		counter++;
		numberList.add(result);
		if (result != 1) {

			while (numberList.size() > 0) {
				if (counter >= 21) {
					numberList.clear();
					System.out.println("0");
					break;
				}
				calculateHappiness(numberList.get(numberList.size() - 1),
						numberList);

			}
		} else {
			numberList.clear();
			System.out.println("1");
		}
	}

	public static void main(String[] args) {
		HappyNumbers hn = new HappyNumbers();
		File file = new File(args[0]);

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String value = "";

			if (numberList.isEmpty()) {
				counter = 0;
			}
			while ((value = br.readLine()) != null) {
				int number = Integer.parseInt(value);

				hn.calculateHappiness(number, numberList);
				// System.out.println(result);

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
