package week4.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateSet {

	public static void main(String[] args) {
		String s="google";
		char[] charArray = s.toCharArray();
		
		Set<Character> abd=new LinkedHashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			abd.add(charArray[i]);
			//System.out.println(abd);
		}
		//for (Character character : abd) {
			//System.out.println(character);
			System.out.println(abd);
		}
		

	}

//}
