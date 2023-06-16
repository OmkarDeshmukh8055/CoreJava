package day21String11ctStrat;

public class Q14newway {

	public static void main(String[] args) {
		// TODO Auto- method stub
String s= "1234";
boolean isonlyDigittrue = true;

for (int i = 0; i <s.length(); i++)
{
	if(s.charAt(i)<'0' && s.charAt(i)>'9')
	{
		isonlyDigittrue=false;
		break;
	}
}
if(isonlyDigittrue==true)
System.out.println("digit only");
else
	System.out.println("few char");

	}

}
