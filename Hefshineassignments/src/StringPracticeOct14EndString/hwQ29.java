package StringPracticeOct14EndString;

import java.util.Arrays;

public class hwQ29 {

	public static void main(String[] args) {
       String s="abcdefghi";
       String[] sa=s.split(" ");
       for (int i = 0; i < sa.length; i++)
       {
		    String s1=sa[i];
		    for (int j =  s1.length()-1;j>=0; j--) 
		    {
				System.out.print(s1.charAt(j)); 
			}
		    System.out.print(" ");
	}
	    
       
       
	}

}
