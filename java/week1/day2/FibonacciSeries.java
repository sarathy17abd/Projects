package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		//int num=8;
		int first=0,second=1,third;
		System.out.println(first);
		System.out.println(second);
		{
			for(int i=0;i<=8;i++) {
				third=first+second;
				System.out.println(third);
				first=second;
				second=third;
			}
		}

	}

}
