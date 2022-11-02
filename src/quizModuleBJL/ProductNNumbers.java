package quizModuleBJL;

public class ProductNNumbers {
	public static double product(double[] numbers) {
		double product = 1;
		for (int i = 0; i < numbers.length; i++) {
			product *= numbers[i];
		}
		return product;
	}
}
