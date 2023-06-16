package zprePractice3;

public class String_Sorting {

	public static void main(String[] args) {
		String s="omkar";
		char[] ch=s.toCharArray();
		for (int i = 0; i <ch.length; i++) 
		{	
			for (int j = i+1; j <ch.length; j++) 
			{
				if(ch[i]>ch[j])
				{
				char ch1=ch[i];
				ch[i]=ch[j];
				ch[j]=ch1;
				}
			}
		}
		String s1=new String(ch); 
		System.out.println(s1);
	}

}
