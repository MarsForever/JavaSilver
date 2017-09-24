package operatorAndDecisionStructure_03;

public class Example04 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a: " + a +  " a++: " + a++ +" a: " + a);
		System.out.println("a: " + a + " a--: " + a-- +" a: " + a );
		System.out.println("a: " + a + " ++a: " + ++a +" a: " + a );
		System.out.println("a: " + a + " --a: " + --a +" a: " + a );
		int b = a++ +a + a-- - a-- + ++a;
		//  b = 10 + 11 + 10 - 9   +  10
		System.out.println(b);
	}
}
