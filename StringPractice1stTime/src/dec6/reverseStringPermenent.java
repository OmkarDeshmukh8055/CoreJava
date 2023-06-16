package dec6;

public class reverseStringPermenent {

	public static void main(String[] args) {

		String s="hefshine hefshine";
		String[] sa=s.split(" ");
		for (int i = 0; i < sa.length; i++)
		{
			String s2=sa[i];
			char ca[]=s2.toCharArray();
				int p=0;
				int q=ca.length-1;
				while(p<q)
				{
				char ch=ca[p];
				ca[p]=ca[q];
				ca[q]=ch;
				p++;q--;
				}
		
		String s3=new String(ca);
		sa[i]=s3;
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.println(sa[i]);
		}
	}

}
