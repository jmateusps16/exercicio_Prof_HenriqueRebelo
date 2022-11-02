package quizModuleBJL;

public class Rainfall {
	public static double averageRainfall(double[] rainfall) {
		double sum = 0;
		int i = 0;
		int count = 0;
		
		while (rainfall[i] != 9999) {
			if (rainfall[i] >= 0) {
				sum = sum + rainfall[i];
				count++;
			}
			
			i++;
		}
		
		if (count > 0) {
			return sum / count;
		} else {
			return 0;
		}
	};
}