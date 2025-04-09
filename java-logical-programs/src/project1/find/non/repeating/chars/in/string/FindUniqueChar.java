package project1.find.non.repeating.chars.in.string;

import java.util.HashSet;

public class FindUniqueChar {

	public static void main(String[] args) {
		
		String sentence = "Manikandan";
		
		char[] charArray = sentence.toCharArray();
		HashSet set = new HashSet();
		for(int i=0; i<charArray.length; i++ ) {
			if(!set.add(charArray[i]));
			System.out.println(charArray[i] + " is repeated char");
		}

	}

}
