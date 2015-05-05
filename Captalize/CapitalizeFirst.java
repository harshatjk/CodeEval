import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CapitalizeFirst {
	public static void main(String[] args) {
		File file = new File("D:/Java Code Base/CodingQuestions/filereverse.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				String reverse = "";
				StringTokenizer st = new StringTokenizer(line," ");
				while(st.hasMoreElements()){
					String convert = "";
					convert = st.nextToken();
					char c = convert.toUpperCase().charAt(0);
					convert = c+convert.substring(1, convert.length());
					//System.out.println(convert);
					reverse = reverse.concat(" "+convert);
				}
				
				System.out.println(reverse);
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
