package day23String13Oct;

import java.util.Iterator;

public class Q29 {

	public static void main(String[] args) {
		//Swipping on lengthbasis
		
String []sa= {"asdfdsdsffdffd","sffdgffs","asds","rrfffddfd","freghuykjhkhff"};

for(String s:sa)
{
	System.out.println(s); 
}
	
for (int i = 0; i < sa.length; i++) 
{
	for (int j = i+1; j < sa.length; j++) 
	{
		if(sa[i].length()>sa[j].length())
		{
			String temp=sa[i];
		sa[i]=sa[j];
		sa[j]=temp;
		}
	
	}
}
System.out.println();
System.out.println("after");
System.out.println();
for(String s:sa)
{
	System.out.println(s);
}
	}

}
