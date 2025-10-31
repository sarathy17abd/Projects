package Javachallenge3;

import java.io.Serializable;

public class Challenge2 {
	public static boolean ispalindromee() {
		String s="race a car";
		String lowercase= s.toLowerCase();
		String replaceAll = lowercase.replaceAll("[^a-z0-9]","");
		String reverse=new StringBuilder(replaceAll).reverse().toString();
		
		return replaceAll.equals(reverse);
		
	}

	public static void main(String[] args) {
		System.out.println(ispalindromee());
	

	}

}
