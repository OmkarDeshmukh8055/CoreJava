package zprePractice5;

public class Trim {

	public static void main(String[] args) {
	
		String s1="   omkar    ";
		
		int i=0;
		int j=s1.length()-1;
		
		while(s1.charAt(i)==' ')
		{
			i++;
		}
		while(s1.charAt(j)==' ')
		{
			j--;
		}
		String s="";
		while(i<=j)
		{
			s=s+s1.charAt(i);
			i++;
		}
		System.out.println(s);
	}

}
