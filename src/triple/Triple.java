package triple;

public class Triple {

	static boolean triplet() {
		int a[] = { 12, 3, 4, 1, 6, 9 };
		int sum = 0;
		int v = 24;

		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j < a.length; j++) {

				for (int k = 2; k < a.length; k++) {

					sum = sum + a[i] + a[j] + a[k];

					if (v == sum) {
						System.out.println("" + a[i] + " " + a[j] + " " + a[k]);
						return true;

					}

					sum = 0;
				}

			}

		}

		return false;
	}

	public static void main(String arg[]) {

		boolean answer = triplet();

	}

}
