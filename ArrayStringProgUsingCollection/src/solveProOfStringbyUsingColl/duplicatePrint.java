package solveProOfStringbyUsingColl;

import java.util.HashMap;

import java.util.LinkedHashSet;
import java.util.Set;

public class duplicatePrint {

	public static void main(String[] args) {

String s="abcdabca";
Set<Character> set=new LinkedHashSet<>();
int count=0;
System.out.println("--duplicate character--");
for (int i = 0; i < s.length(); i++) 
{
   	if(!set.add(s.charAt(i)))
   	{
   		count++;
   	System.out.println(s.charAt(i));
   	}
   		
}
System.out.println("--count--");
System.out.println(count);

	}

}
