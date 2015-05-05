import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AgeDistribution {

	public static void main(String[] args) {
		File file = new File("D:/Java Code Base/CodingQuestions/Tes.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				int number = Integer.parseInt(line);
				if (number >= 0 && number <= 2) {
					System.out.println("Still in Mama's arms");
				} else if (number > 2 && number <= 4) {
					System.out.println("Preschool Manaic");

				} else if (number > 11 && number <= 14) {
					System.out.println("Middle school");

				} else if (number >= 5 && number <= 11) {
					System.out.println("Elementary school");
				} else if (number >= 15 && number <= 18) {
					System.out.println("High school");
				}

				else if (number >= 19 && number <= 22) {
					System.out.println("College");
				} else if (number >= 23 && number <= 65) {
					System.out.println("Working for the man");
				} else if (number >= 66 && number <= 100) {
					System.out.println("The Golden Years");
				} else {
					System.out.println("This program is for humans");
				}
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
