package zprePractice2;

public class Uniqe_Possibilities {

	public static void main(String[] args) {
	
		String s="123";
		String s1="";
		int a=s.length()+1;
		while(a>0)
		{
			s1=s1+s.charAt(a);
			a--;
		}
		System.out.println(s1);
	}

}
