
public class Reverse_Every_Woed {

	public static void main(String[] args) {
		String s="rakmo ihsur hseplak nihcas";
		String []sa=s.split(" ");
		for (int i = 0; i < sa.length; i++)
		{
			String ss=sa[i];
			String m="";
			for (int j =ss.length()-1;j>=0; j--) 
			{
				m=m+ss.charAt(j);
			}
			sa[i]=m;
		}
		String n="";
		for (int i = 0; i < sa.length; i++)
		{
			n=n+sa[i]+" ";
		}
		System.out.println(n);
		
	}

}
