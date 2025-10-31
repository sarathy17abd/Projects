package Javachallenge1;

public class Challenge3 {

	public static void main(String[] args) {
		String str="luffy is still joyboy";
		String[] parts = str.split(" ");
		String fourthword=parts[3];
		int length = fourthword.length();
		System.out.println("length:"+length);

	}

}
