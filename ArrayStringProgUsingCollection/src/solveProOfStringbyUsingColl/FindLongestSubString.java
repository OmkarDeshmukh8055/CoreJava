package solveProOfStringbyUsingColl;

import java.util.HashSet;
import java.util.Set;

public class FindLongestSubString {

	public static void main(String[] args) {


String s="abcdabcdeabcabaabcdef";
Set<Character> set=new HashSet<Character>();
int max=0;

String s1="";

for (int i = 0; i < s.length(); i++) 
{
	for (int j = i; j < s.length(); j++) {
	
	if(!set.add(s.charAt(j)) )
{
	if(set.size()>max)
	{
		max=set.size();
		s1=set.toString();
	}
	set.clear();
	break;

}
	}
}
System.out.println(max);
System.out.println(s1);
	}

}
