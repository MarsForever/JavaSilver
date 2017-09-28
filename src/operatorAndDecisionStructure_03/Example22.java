package operatorAndDecisionStructure_03;

public class Example22 {
	public static void main(String[] args) {
		int point = 80;
		String val = point < 40 ? "D" : point < 60 ? "C" : point < 80 ? "B" : "A";
		System.out.println(val);
	}
}
