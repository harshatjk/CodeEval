public class MultiplicationTables {

	void multiply() {
		int k;
		for (int i = 1; i <= 12; i++) {
			if (i == 1) {
				System.out.println();
			}
			for (int j = 1; j <= 12; j++) {
				k = i * j;

				if (k < 10) {
					System.out.print("    " + k);

				} else if (k >= 10 && k < 100) {

					System.out.print("   " + k);

				} else if (k >= 100 && k < 1000) {
					System.out.print("  " + k);
				}
			}

			System.out.println();

		}
	}

	public static void main(String[] args) {
		MultiplicationTables mt = new MultiplicationTables();
		mt.multiply();
	}

}
