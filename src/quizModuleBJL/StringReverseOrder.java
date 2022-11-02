package quizModuleBJL;

public class StringReverseOrder {
	public static String getStringInReverseOrder(String s) {
		StringBuffer reverso = new StringBuffer(s);
		s = reverso.reverse().toString();
		return s;
	}
}
