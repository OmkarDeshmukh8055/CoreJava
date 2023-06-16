package zprePractice3;

public class Q28Array {

	public static void main(String[] args) 
	{
		String s[]= {"sawpi","sagar","sachin","nagu","pavan","om","pooja","akash"};
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i+1; j < s.length; j++) 
			{
				if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]); 
		}
	}

}
