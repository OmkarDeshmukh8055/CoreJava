package dec6;

public class Q29 {

	public static void main(String[] args) {

		String[] sa= {"abc" ,"abcd","abcdef","ab","a"};
		
		for (int i = 0; i < sa.length; i++)
		{
			for (int j = 1+i; j < sa.length; j++)
			{
				if(sa[i].length()>sa[j].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.println(sa[i]);
		}
	}

}
