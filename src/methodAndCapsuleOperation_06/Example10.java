package methodAndCapsuleOperation_06;

public class Example10 {
	public static void main(String[] args) {
		Example10 m = new Example10();
		System.out.println(m.calc(2, 3));
	}
	private double calc(double a, int b) {
		return (a + b) / 2;
	}
	private double calc(int a , double b) {
		return (a + b) / 2;
	}
//	private int calc(int a , int b) {
//		return (a + b) /2;
//	}
}
