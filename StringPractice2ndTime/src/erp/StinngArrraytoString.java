package erp;

public class StinngArrraytoString {

	public static void main(String[] args) {
String sa[]= {"om","nana","kalpesh","sachin"};
String s1="";
for (int i = 0; i < sa.length; i++) {
	s1=s1+sa[i];
}
System.out.println(s1);
char ca[]=s1.toCharArray();
for (int i = 0; i < ca.length; i++) {
	System.out.println(ca[i]);
}
	}

}
