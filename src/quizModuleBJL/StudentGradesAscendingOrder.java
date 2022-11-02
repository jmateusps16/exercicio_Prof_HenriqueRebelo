package quizModuleBJL;

import java.util.Arrays;

public class StudentGradesAscendingOrder {
	public static double[] getGradesInAscendingOrder(double[] grades) {
		for (int i = 0; i < grades.length; i++) {

			grades[i] = +grades[i];
		}

		Arrays.sort(grades);

		for (int i = 0; i < grades.length; i++) {

			grades[i] = +grades[i];
		}
		return grades;
	}
}
