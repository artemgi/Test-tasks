public class Calculator {
	private Calculator() {
	}
	public static double add(double a, double b){
		return a+b;
	}
	public static double subs(double a, double b){
		return a-b;
	}
	public static double mult(double a, double b){
		return a*b;
	}
	public static double divide(double a, double b){
		if (b==0){
			throw new IllegalArgumentException("Нельзя делить на ноль");
		}
		return a/b;
	}
}
