package day24String14Oct;

import java.util.Arrays;

public class removespaceandandexx {

	public static void main(String[] args) {
String s="abc def ghi jkl";
String ss[]=s.split(" ");
System.out.println(Arrays.toString(ss));

int spacecount=0;
for (int i = 0; i < s.length(); i++) 
	
	if(s.charAt(i)==' ')
		spacecount++;
	String []sa=new String [spacecount+1];
	String s1="";
	int saIndex=0;

	for (int i = 0; i < s.length(); i++)
	{
		char ch=s.charAt(i);
		if(ch==' ')
		{
			sa[saIndex++]=s1;
			s1="";
		}
		else if(i==s.length()-1)
		{
			s1=s1+ch;
			sa[saIndex++]=s1;
			
		}
		else
		{
			s1=s1+ch;
		}
	}
	

for (int i = 0; i < sa.length; i++) 
{
	System.out.println(sa[i]);
}
	
	}
}
