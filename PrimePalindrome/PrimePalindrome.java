public class PrimePalindrome {

	int reverse = 0;
	int number;

	public void palindrome() {

		for (int i = 1; i <= 1000; i++) {
			number = i;
			while (i > 0) {
				reverse = reverse * 10 + (i % 10);
				i = i / 10;
				if (i == 0 && number == 1000) {
					System.out.println(reverse);
				}
			}
		}
	}

	public static void main(String[] args) {
		PrimePalindrome pm = new PrimePalindrome();
		pm.palindrome();
	}
}
