package tuesdayOct19;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		String[] s1= {"a","b","c","d","e","f","g"};
		String[]s2={"w","x","y","z"};
		String[]s3=new String[s1.length+s2.length];
		
		myString(s1,s2,s3,0,0);
		System.out.println(Arrays.toString(s3));
	
		
	}

	private static void myString(String[] s1, String[] s2, String[] s3, int index, int i) 
	{
    if(index<s3.length)
    {
    	if(i<s1.length)
    	{
    		s3[index++]=s1[i];
    	}
    	if(i<s2.length)
    	{
    		s3[index++]=s2[i];
    	}
    	myString(s1,s2,s3,index,i+1);
    }
	}
}
