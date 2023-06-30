package practice;

import java.util.Map;
import java.util.TreeMap;

public class StringMaximumOccurence {
	
	public static void main(String [] args)
	{
	String str = "abcaba";

	Map<Character, Integer> occ = new TreeMap<Character, Integer>();

	for (int i = 0; i < str.length(); i++) {
		if (!occ.containsKey(str.charAt(i))) {
			occ.put(str.charAt(i), 1);
		} 
		else 
			occ.put(str.charAt(i), occ.get(str.charAt(i)) + 1);
	}
	System.out.println(occ);
	}

}

