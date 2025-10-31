package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=3;
		//boolean isprime=true;
		//boolean isnotprime=false;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				System.out.println("Prime number");
				break;
				
			}else {
				System.out.println("not a prime number");
				break;
		}

	}

	}
}