package com.example.restequation.util;

public class EquationUtil {
	public static String calculateSolveQuadratic(int a, int b, int c) {
		double d = Math.pow(b, 2) - 4 * a * c;
		if (d < 0) {
			return "Корней нет";
		} else {
			if (d > 0) {
				double root1 = (-b + Math.sqrt(d)) / (2 * a);
				double root2 = (-b - Math.sqrt(d)) / (2 * a);
				return String.format("корень x1 = %s; корень x2 = %s", root1, root2);
			} else {
				double root = (-b + Math.sqrt(d)) / (2 * a);
				return String.format("корень x1 = %s", root);
			}
		}
	}
}
