package operatorAndDecisionStructure_03;

public class Example06 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		if(10 < a && 10 < ++b) {
			a++;
		}
		System.out.println(a + b	);
	}
}
