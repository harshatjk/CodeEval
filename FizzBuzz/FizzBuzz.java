import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FizzBuzz {

	public static void main(String[] args) {
		File file = new File("D:/Java Code Base/CodingQuestions/FizzBuzz.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			int count =0;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreElements()) {
					count ++;
					int fdividend = Integer.parseInt(st.nextToken());
					int sdividend = Integer.parseInt(st.nextToken());
					int limit = Integer.parseInt(st.nextToken());
					// System.out.println(fdividend+ "vv "+sdividend + " cc"+
					// limit);
					if(count >=2){
						System.out.println("");
					}
					for (int i = 1; i <= limit; i++) {
						if ((i % fdividend == 0) && !( i % sdividend == 0)) {
							System.out.print(" F");
						}
						else if (( i % sdividend == 0) && !(i % fdividend == 0)){
							System.out.print(" B");
						}
						else if (( i % sdividend == 0) && (i % fdividend == 0)){
							System.out.print(" FB");
						}
						else{
							if(i == 1){
								System.out.print(i);
							}
							else{
								System.out.print(" " +i);
							}
							
						}
					}
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
