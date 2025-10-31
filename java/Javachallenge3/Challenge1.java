package Javachallenge3;

public class Challenge1 {
	public static boolean ispalindrome() {
		String s="A man,a plan,a canal";
		String lowerCase = s.toLowerCase();
		String replaceAll = lowerCase.replaceAll("[^a-z0-9]","");
		String reverse=new StringBuilder(replaceAll).reverse().toString();
		
		return replaceAll.equals(reverse);
		
	}

	public static void main(String[] args) {
		
		System.out.println(ispalindrome());
		
		
	}

}
