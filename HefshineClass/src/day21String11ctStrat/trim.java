package day21String11ctStrat;

public class trim {

	public static void main(String[] args) {
String s="      0mkar      ";
//System.out.println(s);
//s=s.trim();
//System.out.println(s);


int i=0;
int j=s.length()-1;

while(true)
{
	if(s.charAt(i)==' ')
	i++;
	else
		break;
}
while(true)
{
	if(s.charAt(j)==' ')
		j--;
	else
		break;
}
String s1="";
for (int k = i; k <=j; k++) 
{
	s1=s1+s.charAt(k);
}
System.out.println(s1);
	}

}
