package Javachallenge1;

public class Challenge1 {

	private static String[] p[];

	public static void main(String[] args) {
		String str="Hello world";
		String[] parts = str.split(" ");
		String secondword=parts[1];
		int length = secondword.length();
		System.out.println("length:"+length);
	

	}

}
