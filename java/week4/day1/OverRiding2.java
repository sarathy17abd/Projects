package week4.day1;

public class OverRiding2 extends OverRiding1 {
	public void add() {
		int a=5;
		int b=10;
		System.out.println(a+b);
		super.add();
	}
	

	public static void main(String[] args) {
		OverRiding2 over=new OverRiding2();
		over.add();

	}

}
