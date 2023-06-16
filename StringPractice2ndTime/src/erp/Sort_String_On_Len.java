package erp;

public class Sort_String_On_Len {

	public static void main(String[] args) {
String s1="54321";
char[] ch=s1.toCharArray();
for (int i = 0; i <s1.length(); i++)
{
	for (int j = i+1; j <s1.length(); j++) {
		if(ch[i]>ch[j])
		{char c=ch[i];
		ch[i]=ch[j];
		ch[j]=c;
			
		}
	}
}
for (int i = 0; i < ch.length; i++) {
	System.out.print(ch[i]);
}
	}

}
