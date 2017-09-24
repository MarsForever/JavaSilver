package operatorAndDecisionStructure_03;

public class Sample09 {
	private int num;
	private String name;
	public Sample09(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public boolean equals(Object obj) {
		System.out.println("obj : " + obj);
		System.out.println("this : " + this);
		if(obj == null) {
			return false;
		}
		if(obj instanceof Sample09) {
			Sample09 s =(Sample09) obj;
			System.out.println("s : " + s);
			System.out.println("s.num : " + s.num);

			return s.num == this.num;
		}
		return 	false;
	}
}
