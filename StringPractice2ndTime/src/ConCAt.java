
public class ConCAt {

	public static void main(String[] args) {	
		String s="oma";
		
		char ca[]=s.toCharArray();
		String s2="";
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]!='a')
				s2=s2+ca[i];
		}
		System.out.println(s);
		System.out.println(s2);
		String s1="kar";
		s=s2+s1;
		System.out.println(s);
		
		// 2nd way
		String a="om kar";
		String b="";
		String sa[]=a.split(" ");
	for (int i = 0; i < sa.length; i++) {
		b=b+sa[i];
	}
	System.out.println(b);
	}

}
