package dec6;

public class onlyDigitOrNot {

	public static void main(String[] args) {

	String s="123";
		 boolean digit=true;
	for (int i = 0; i < s.length(); i++) 
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			
		}
		else
		{
			digit=false;
			break;
		}
			
	}
	if(digit==true)
		System.out.println("only Digit");
	else
		System.out.println("ont only Digit");
	}

}
