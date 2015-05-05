public class MultiplicationTableSolved {

	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			System.out.print(i);
			for (int j = 2; j <= 12; j++) {
				for (int k = 0; k < 4 - length(i * j); k++) {
					System.out.print(" ");
				}
				System.out.print(i * j);
			}
			System.out.println();
		}
	}

	// returns the amount of digits of a given integer
	public static int length(int n) {
		if (n < 10) {
			return 1;
		} else {
			return 1 + length(n / 10);
		}
	}
}
