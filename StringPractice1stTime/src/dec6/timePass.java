package dec6;

public class timePass {

	public static void main(String[] args) {

		String s="this  is statement";
		String d[]=s.split(" ");
		String s1="";
		for (int i = d.length-1;i>=0; i--)
		{
			s1=s1+d[i]+" ";
		}
		System.out.println(s1);
	}

}
