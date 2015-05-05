import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Gain {

	public static void main(String[] args) {
		try {
			File file = new File("D:/Java Code Base/CodingQuestions/Gain.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			ArrayList<Integer> al = new ArrayList<>();
			ArrayList<Integer> bl = new ArrayList<>();
			String line;
			int sumValues = 0;
			while ((line = br.readLine()) != null) {
				if (!al.isEmpty() || !bl.isEmpty()) {
					al.clear();
					bl.clear();
				}
				StringTokenizer st = new StringTokenizer(line, "; ");
				while (st.hasMoreElements()) {
					al.add(Integer.parseInt(st.nextToken()));
				}
				int days = al.get(0);
				int start = 1;

				while (days < al.size()) {
					int sum = 0;
					int count = 0;
					while (start <= days) {

						sum = sum + al.get(start + count);
						count++;
						if (((start - 1) + count) == days) {
							break;
						}
					}
					bl.add(sum);
					start++;
					days++;
				}
				// System.out.println("yoyyo");
				Collections.sort(bl);
				System.out.println(bl.get(bl.size() - 1));
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