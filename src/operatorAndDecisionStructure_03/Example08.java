package operatorAndDecisionStructure_03;
import operatorAndDecisionStructure_03.Sample07;

public class Example08{
	public static void main(String[] args) {
		Sample07 s1 = new Sample07(10);
		Sample07 s2 = s1;
		s1 = new Sample07(10);
		System.out.println("s1: " + s1 + " \ns2: " + s2);
		System.out.println(s1 == s2);
	}
}
