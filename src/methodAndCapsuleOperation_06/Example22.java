package methodAndCapsuleOperation_06;

public class Example22 {
	public static void main(String[] args) {
		Sample22 s = new Sample22(10);
		modify(s);
		System.out.println(s.num);
	}
	private static 	void modify(Sample22 s) {
		s.num *= 2;
	}
}
