	import java.io.*;
	import java.util.*; 

	public class NmodMSolved {
	    public static void main(String[] args) throws FileNotFoundException {
			File file = new File(args[0]);
			Scanner in = new Scanner(file);
			
			while(in.hasNextLine()) {
				String line = in.nextLine(); 
				String[] nums = line.split(",");
				int first = Integer.parseInt(nums[0]);
				int second = Integer.parseInt(nums[1]);
				int divided = first / second;
				int result = first - (divided * second);
				System.out.println(result); 
			}
	    }
}
