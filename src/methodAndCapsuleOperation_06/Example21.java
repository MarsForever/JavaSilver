package methodAndCapsuleOperation_06;

public class Example21 {
	public static void main(String[] args) {
		Sample21 s = new Sample21(10);
		modify(s.num);
		System.out.println(s.num);
	}
	private static void modify(int num) {
		num *= 2;
	}
}
