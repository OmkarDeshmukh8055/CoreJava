package dec6;

import java.util.Arrays;

public class Q18NovBook {

	public static void main(String[] args) {
		String s = "aaabbbbbccbcc";
		String s1="";
		
		for (int i = 0; i < s.length(); i++) 
		{	int cnt=0;
			for (int j = 0; j <s1.length(); j++)
			{
				if(s.charAt(i)==s1.charAt(j))
					cnt++;
			}
			if(cnt==0)
				s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		
		char ca []=s1.toCharArray();
		int [] ia=new int [ca.length];
		
		for (int i = 0; i < s1.length(); i++)
		{	
			int count=0;
			for (int j = 0; j <s.length(); j++)
			{
				if(s1.charAt(i)==s.charAt(j))
					count++;
			}
			ia[i]=count;
		}
		System.out.println(Arrays.toString(ia));
		for (int i = 0; i < ia.length; i++)
		{
			for (int j = 0; j < ia.length; j++)
			{
				if(ia[i]>ia[j])
				{
					int temp=ia[i];
					ia[i]=ia[j];
					ia[j]=temp;
					
					char temp1=ca[i];
					ca[i]=ca[j];
					ca[j]=temp1;
				}
			}
		}
		System.out.println("Sorted "); 
		
		System.out.println(Arrays.toString(ia));
		System.out.println(Arrays.toString(ca));


	}

}
