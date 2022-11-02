package quizModuleBJL;

public class ProductNNumbers2 {
	public static double product(double[] numbers) {
		double product = 1;
		int i = 0;
		while (numbers.length != i) {
			product *= numbers[i];
			i++;
		}
		return product;
	}
}