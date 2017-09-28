package operatorAndDecisionStructure_03;

public class Example19 {
	public static void main(String[] args) {
		final int NUM = 0;
		int num = 0;
		switch (num) {
		case "10" : System.out.println("A");
					break;
		case num  : System.out.println("B");
					break;
		case 2 * 5: System.out.println("C");
					break;
		}
	}
	
}
