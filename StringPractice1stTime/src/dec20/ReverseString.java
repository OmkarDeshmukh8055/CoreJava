package dec20;
import java.util.Arrays;
public class ReverseString 
{
	public static void main(String[] args)
	{
		String s="makO r ehsD uhkm";
		String[]ch=s.split(" ");
		
		ch=reverse(ch,0);
		System.out.println(Arrays.toString(ch));
	}

	private static String[] reverse(String[] ch, int i)
	{
			if(i<ch.length)
			{
				String s1=ch[i];
				char ch1[]=s1.toCharArray();
				
				int q=ch1.length-1;
				ch1=swip(ch1,q,0);
				String s2=new String (ch1);
				ch[i]=s2;
			
				return reverse(ch, i+1);
			}
		return ch;
	}

	private static char[] swip(char[] ch1, int q, int i)
	{
		if(i<ch1.length/2)
		{
			char c=ch1[i];
			ch1[i]=ch1[q];
			ch1[q]=c;
			
			return swip(ch1,q,i+1);
		}
		return ch1;
	}

}
