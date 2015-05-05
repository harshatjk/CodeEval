import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumOfNumbers {

	
	public static void main(String[] args) {
		int number;
		int sum;
		File fs = new File(args[0]);
		try {
			BufferedReader br = new BufferedReader(new FileReader(fs));
			String line = "";
			
			while ((line = br.readLine()) != null) {
				number = Integer.parseInt(line);
				sum = 0;
				while (number != 0) {
					sum = sum + (number % 10);
					number = number / 10;
				}
				System.out.println(sum);

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
