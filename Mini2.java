package mini2;

public class Mini2 {

	public static String everyNth(String s, int n) {
		if (s.length() < n) {
			return "";
		} else {
			return s.charAt(n - 1) + everyNth(s.substring(n), n);
		}
	}

	private static String noNth(String s, int n, int count) {
		if (count <= s.length()) {
			if (count % n != 0) {
				return s.charAt(count - 1) + noNth(s, n, count + 1);
			} else {
				return noNth(s, n, count + 1);
			}
		} else {
			return "";
		}
	}

	public static String noNth(String s, int n) {
		return noNth(s, n, 1);
	}

	public static String unique(String s) {
		if (s.length() <= 1) {
			return s;
		} else {
			String s1 = unique(s.substring(1));
			if (s.charAt(0) != s.charAt(1)) {
				s1 = s.charAt(0) + s1;
			}
			return s1;
		}

	}

	public static int toInt(String number) {
		if (number.length() == 1) {
			return Character.getNumericValue(number.charAt(0));
		} else {
			return (int) (((number.charAt(0) - '0') * Math.pow(10, number.length() - 1)) + toInt(number.substring(1)));
		}

	}

	public static boolean isMatched(String s) {
		if (s.length() == 0) {
			return true;
		} else if (s.charAt(0) == '(' && !s.contains(")")) {
			return false;
		} else if (s.charAt(0) == '[' && !s.contains("]")) {
			return false;
		} else if (s.charAt(0) == '{' && !s.contains("}")) {
			return false;
		} else if (s.charAt(0) == '<' && !s.contains(">")) {
			return false;
		} else {
			if (s.charAt(0) == '(') {
				return isMatched(s.substring(1, s.indexOf(')')) + s.substring(s.indexOf(')') + 1, s.length()));
			} else if (s.charAt(0) == '[') {
				return isMatched(s.substring(1, s.indexOf(']')) + s.substring(s.indexOf(']') + 1, s.length()));
			} else if (s.charAt(0) == '{') {
				return isMatched(s.substring(1, s.indexOf('}')) + s.substring(s.indexOf('}') + 1, s.length()));
			} else if (s.charAt(0) == '<') {
				return isMatched(s.substring(1, s.indexOf('>')) + s.substring(s.indexOf('>') + 1, s.length()));
			}
			else {
				return false;
			}
		}
		

	}

	public static double pow(double base, int exponent) {
		if (exponent == 0) {
			return 1.0;
		} else if (exponent > 0) {
			if (exponent % 2 == 0) {
				double number = pow(base, exponent / 2);
				return number * number;
			} else {
				return base * pow(base, exponent - 1);
			}
		} else {
			return 1.0 / pow(base, -exponent);
		}

	}

}
