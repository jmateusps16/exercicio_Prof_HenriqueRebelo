package quizModuleBJL;

public class SumNatural {

	public static int sum(int x) {
		int sum = 0;
		int count = 1;
		while (count <= x) {
			sum = sum + count;
			count++;
		}
		return sum;
	}
}
