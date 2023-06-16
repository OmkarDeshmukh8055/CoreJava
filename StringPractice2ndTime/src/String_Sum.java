
public class String_Sum {

	public static void main(String[] args) {
		int sum=0;
		
		String s="12345qw";
		
		for (int i = 0; i <s.length(); i++) 
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
				sum=sum+s.charAt(i)-48;
		}
		System.out.println(sum);
		System.out.println(s.codePointAt(0));
	}

}
