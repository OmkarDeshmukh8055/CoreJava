package day21String11ctStrat;

public class sum {

	public static void main(String[] args) {
String s="12345ffh";
int sum=0;
for (int i = 0; i < s.length(); i++) 
{
   char ch=s.charAt(i);
   if(ch>='0' && ch<='9')
	   
	   //if we are not add 48 that time it take ascll value, because of we use char datatype.
	   sum=sum+(ch-48);
	
}
System.out.println(sum);
	}

}
