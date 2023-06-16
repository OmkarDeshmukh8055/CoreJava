package zprePractice5;

public class Replace_String {

	public static void main(String[] args) {
		String s="abcabc d";
		String replace="xyz";
		String sa[]=s.split("abc");
		String s1="";
		for (int i = 0; i <sa.length; i++) 
		{
			if(i==sa.length-1)
			{
				s1=s1+sa[i];
			}
			else
			s1=s1+sa[i]+replace;
		}
		System.out.println(s1);
	}

}
