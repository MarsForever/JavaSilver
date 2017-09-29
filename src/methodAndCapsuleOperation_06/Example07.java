package methodAndCapsuleOperation_06;

public class Example07 {
	public static void main(String[] args) {
		Sample07.num = 10;
		System.out.println("Sample07.num: " + Sample07.num);
		Sample07 s = new Sample07();
		Sample07 s2 = new Sample07();
		s.num += 10;
		System.out.println("Sample07.num: " + Sample07.num);
		s2.num = 30;
		System.out.println(  "Sample07.num: " + Sample07.num);
	}
}
